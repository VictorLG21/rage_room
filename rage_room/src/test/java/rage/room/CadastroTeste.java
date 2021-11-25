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
    public void validarCadastro_SUCESSO() throws Exception {
        String NOME, PROFISSAO, RG;
        int DIA, MES, ANO;


        NOME = "SANDRA PUGA";
        PROFISSAO = "EXCELENTE PROFESSORA DE QUALIDADE DE SOFTWARE";
        RG = "232345455";
        DIA = 19;
        MES = 03;
        ANO = 1990;


        assertTrue("NOME INVÁLIDO!", Cliente.validarNome(NOME));
        assertTrue("PROFISSÃO INVÁLIDA!", Cliente.validarProfissao(PROFISSAO));
        assertTrue("RG INVÁLIDO!", Cliente.validarRG(RG));
        assertTrue("DATA DE NASCIMENTO INVÁLIDA!", Cliente.validarIdade(DIA, MES, ANO));
    }

    @Test
    public void validarCadastro_FRACASSO() throws Exception {
        String NOME, PROFISSAO, RG;
        int DIA, MES, ANO;


        NOME = "S4NDR4 PUG4";
        PROFISSAO = "EXC3L3NT3 PROF3SSORA D3 QUALIDAD3 D3 SOFTWAR3";
        RG = "23234A4AA";
        DIA = 45;
        MES = 20;
        ANO = 2112;


        assertTrue("NOME INVÁLIDO!", Cliente.validarNome(NOME));
        assertTrue("PROFISSÃO INVÁLIDA!", Cliente.validarProfissao(PROFISSAO));
        assertTrue("RG INVÁLIDO!", Cliente.validarRG(RG));
        assertTrue("DATA DE NASCIMENTO INVÁLIDA!", Cliente.validarIdade(DIA, MES, ANO));
    }
}
