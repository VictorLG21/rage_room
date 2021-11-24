package rage.room;


public class Destruicao {
    public static void main(String[] args) {
        Cliente cliente_01 = new Cliente();
        // cliente_01.diaNascimento = 10;
        // cliente_01.mesNascimento = 01;
        // cliente_01.anoNascimento = 2004;

        // boolean resultadoValidacao = cliente_01.validarIdade(cliente_01.diaNascimento, cliente_01.mesNascimento, cliente_01.anoNascimento);

        // System.out.println(resultadoValidacao);


        // cliente_01.profissao = "Mé442";
        // boolean res = cliente_01.validarProfissao(cliente_01.profissao);
        // System.out.println(res);

        cliente_01.rg = "437AA6285";
        boolean res = cliente_01.validarRG(cliente_01.rg);
        System.out.println(res);
    }
}
