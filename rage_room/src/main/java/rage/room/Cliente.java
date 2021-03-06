package rage.room;


/* IMPORTAÇÕES */
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;


public class Cliente {
    String nome;
    String profissao;
    String rg;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;


    /* MÉTODOS */
    public Cliente(String nome, String profissao, String rg, int dia, int mes, int ano) {
        this.nome = nome;
        this.profissao = profissao;
        this.rg = rg;
        this.diaNascimento = dia;
        this.mesNascimento = mes;
        this.anoNascimento = ano;
    }

    public String toString() {
        return "NOME: " + nome + "\n" + "PROFISSÃO: " + profissao + "\n" + "RG: " + rg + "\n" + "DATA DE NASCIMENTO: " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento;
    }

    public static boolean validarIdade(int diaNascimento, int mesNascimento, int anoNascimento) {
        Date data = new Date();
        LocalDate dataLocal = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int diaAtual = dataLocal.getDayOfMonth();
        int mesAtual = dataLocal.getMonthValue();
        int anoAtual = dataLocal.getYear();

        if((diaNascimento >= 1 && diaNascimento <= 31) && (mesNascimento >= 1 && mesNascimento <= 12) && (anoNascimento >= 1900 && anoNascimento <= 2021) && (anoAtual - anoNascimento >= 18 && mesAtual - mesNascimento >= 0 && diaAtual - diaNascimento >= 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarNome(String nome) {
        if(nome.length() >= 2 &&  nome.length() <= 45 && nome.matches("[a-zA-Z \u00C0-\u017F]+")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarProfissao(String profissao) {
        if(profissao.length() >= 3 &&  profissao.length() <= 45 && profissao.matches("[a-zA-Z \u00C0-\u017F]+")) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarRG(String rg) {
        if(rg.length() == 9) {
            try {
                Integer.parseInt(rg);
            } catch (Exception e) {
                throw new NumberFormatException("RG INVÁLIDO!");
            }

            return true;
        } else {
            return false;
        }
    }

    public static boolean verificarDuplicidade(String rg, ArrayList<Cliente> banco) {
        for(Cliente jk : banco) {
            if(!jk.toString().contains(rg)) {
                return true;
            }
        }

        return false;
    }

    public static boolean removerCliente(String rg, ArrayList<Cliente> banco) {
        int index = 0;

        for(Cliente jk : banco) {
            if(jk.toString().contains(rg)) {
                index = banco.indexOf(jk);
                banco.remove(index);
                return true;
            }
        }
        
        return false;
    }
}
