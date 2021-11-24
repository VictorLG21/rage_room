package rage.room;


/* IMPORTAÇÕES */
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Cliente {
    String nome;
    String profissao;
    String rg;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;


    /* MÉTODOS */
    public boolean validarIdade(int diaNascimento, int mesNascimento, int anoNascimento) {
        Date data = new Date();
        LocalDate dataLocal = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int diaAtual = dataLocal.getDayOfMonth();
        int mesAtual = dataLocal.getMonthValue();
        int anoAtual = dataLocal.getYear();

        if(anoAtual - anoNascimento >= 18 && mesAtual - mesNascimento >= 0 && diaAtual - diaNascimento >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarNome(String nome) {
        if(nome.length() >= 2 &&  nome.length() <= 45 && nome.matches("[a-zA-Z\u00C0-\u017F]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarProfissao(String profissao) {
        if(profissao.length() >= 3 &&  profissao.length() <= 45 && profissao.matches("[a-zA-Z\u00C0-\u017F]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarRG(String rg) {
        if(rg.length() == 9) {
            try {
                Integer.parseInt(rg);
            } catch (Exception e) {
                throw new NumberFormatException("Formato inválido do RG.");
            }

            return true;
        } else {
            return false;
        }
    }
}
