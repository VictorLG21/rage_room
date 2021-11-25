package rage.room;


/* IMPORTAÇÕES */
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CadastroTeste {
    @Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}

    
    @Test
    public void validarNome_SUCESSO() throws Exception {
        String NOME = "SANDRA PUGA";

        assertTrue("NOME INVÁLIDO!", Cliente.validarNome(NOME));
    }


    @Test
    public void validarNome_FRACASSO() throws Exception {
        String NOME = "S4NDR4 PUG4";

        assertTrue("NOME INVÁLIDO!", Cliente.validarNome(NOME));
    }


    @Test
    public void validarProfissao_SUCESSO() throws Exception {
        String PROFISSAO = "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE";

        assertTrue("PROFISSÃO INVÁLIDA!", Cliente.validarProfissao(PROFISSAO));
    }


    @Test
    public void validarProfissao_FRACASSO() throws Exception {
        String PROFISSAO = "EXC3L3NT3 PR0F3SS0R4 D3 QU4LID4D3 D3 S0FTW4R3";

        assertTrue("PROFISSÃO INVÁLIDA!", Cliente.validarProfissao(PROFISSAO));
    }


    @Test
    public void validarRG_SUCESSO() throws Exception {
        String RG = "525284840";

        assertTrue("RG INVÁLIDO!", Cliente.validarRG(RG));
    }


    @Test
    public void validarRG_FRACASSO() throws Exception {
        String RG = "B2B2LA8AO";

        assertTrue("RG INVÁLIDO!", Cliente.validarRG(RG));
    }


    @Test
    public void validarDataNascimento_SUCESSO() throws Exception {
        int dia = 7;
        int mes = 8;
        int ano = 1990;

        assertTrue("DATA DE NASCIMENTO INVÁLIDA", Cliente.validarIdade(dia, mes, ano));
    }


    @Test
    public void validarDataNascimento_FRACASSO() throws Exception {
        int dia = 7;
        int mes = 8;
        int ano = 2015;

        assertTrue("DATA DE NASCIMENTO INVÁLIDA", Cliente.validarIdade(dia, mes, ano));
    }


    @Test
    public void verificarDuplicidade_SUCESSO() throws Exception {
        ArrayList<Cliente> banco = new ArrayList<Cliente>();

        // Primeiro cliente: sem restrições
        banco.add(new Cliente(
            "SANDRA PUGA",
            "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE",
            "232345455", // RG
            7, 8, 1990
        ));

        // Segundo cliente em diante: não pode haver duplicidade no RG!
        String NOME = "SANDRA PUGA";
        String PROFISSAO = "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE";
        String RG = "232345456"; // Novo cliente possui RG DIFERENTE!
        int DIA = 7;
        int MES = 8;
        int ANO = 1990;

        Cliente cliente = new Cliente(NOME, PROFISSAO, RG, DIA, MES, ANO);

        if(!Cliente.verificarDuplicidade(RG, banco)) {
            assertTrue("RG JÁ CADASTRADO!", Cliente.verificarDuplicidade(RG, banco));
        } else {
            banco.add(cliente);
        }
    }


    @Test
    public void verificarDuplicidade_FRACASSO() throws Exception {
        ArrayList<Cliente> banco = new ArrayList<Cliente>();

        // Primeiro cliente: sem restrições
        banco.add(new Cliente(
            "SANDRA PUGA",
            "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE",
            "232345455", // RG
            7, 8, 1990
        ));

        // Segundo cliente em diante: não pode haver duplicidade no RG!
        String NOME = "SANDRA PUGA";
        String PROFISSAO = "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE";
        String RG = "232345455"; // Novo cliente possui RG DUPLICADO!
        int DIA = 7;
        int MES = 8;
        int ANO = 1990;

        Cliente cliente = new Cliente(NOME, PROFISSAO, RG, DIA, MES, ANO);

        if(!Cliente.verificarDuplicidade(RG, banco)) {
            assertTrue("RG JÁ CADASTRADO!", Cliente.verificarDuplicidade(RG, banco));
        } else {
            banco.add(cliente);
        }
    }


    @Test
    public void removerCliente_SUCESSO() throws Exception {
        ArrayList<Cliente> banco = new ArrayList<Cliente>();

        // Adicionando clientes no banco para realização do teste
        banco.add(new Cliente(
            "SANDRA PUGA",
            "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE",
            "232345455", // Busca será realizada pelo RG!
            7, 8, 1990
        ));

        // Inserir o RG do cliente que será removido do sistema
        String RG = "232345455"; // RG que, de fato, já foi cadastrado anteriormente!
        assertTrue("RG NÃO ENCONTRADO!", Cliente.removerCliente(RG, banco));
    }


    @Test
    public void removerCliente_FRACASSO() throws Exception {
        ArrayList<Cliente> banco = new ArrayList<Cliente>();

        // Adicionando clientes no banco para realização do teste
        banco.add(new Cliente(
            "SANDRA PUGA",
            "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE",
            "232345455", // Busca será realizada pelo RG!
            7, 8, 1990
        ));

        // Inserir o RG do cliente que será removido do sistema
        String RG = "232345456"; // RG que nunca foi cadastrado antes!
        assertTrue("RG NÃO ENCONTRADO!", Cliente.removerCliente(RG, banco));
    }
}
