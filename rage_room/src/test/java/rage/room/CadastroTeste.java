package rage.room;


/* IMPORTAÇÕES */
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CadastroTeste {
    @Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}

    @Test
    public void validarCadastro() throws Exception {
        String NOME, PROFISSAO, RG;
        int DIA, MES, ANO;


        NOME = "Zé Carvalho";
        PROFISSAO = "AUXILIAR DE GENTE GRANDE";
        RG = "232345456";
        DIA = 5;
        MES = 03;
        ANO = 2003;


        assertTrue("NOME INVÁLIDO!", Cliente.validarNome(NOME));
        assertTrue("PROFISSÃO INVÁLIDA!", Cliente.validarProfissao(PROFISSAO));
        assertTrue("RG INVÁLIDO!", Cliente.validarRG(RG));
        assertTrue("DATA DE NASCIMENTO INVÁLIDA!", Cliente.validarIdade(DIA, MES, ANO));
    }
}
