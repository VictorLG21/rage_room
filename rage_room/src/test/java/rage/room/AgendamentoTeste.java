package rage.room;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AgendamentoTeste {
    @Before
	public void setUp() throws Exception {}

	@After
	public void tearDown() throws Exception {}

    @Test
    public void validarAgendamento() throws Exception {
        int Participantes;
        int DIA, MES, ANO, sala;
        List<Agendamento> agenda = new ArrayList<>();
        Agendamento a1 = new Agendamento(3,"Filósofo",false,2,20,10,2021);
        Agendamento a2 = new Agendamento(1,"Filósofo",false,3,20,10,2021);
        Agendamento a3 = new Agendamento(5,"Filósofo",false,4,20,10,2021);
       agenda.add(a1);
       agenda.add(a2);
       agenda.add(a3);

        sala = 3;
        Participantes = 6;
        DIA = 30;
        MES = 11;
        ANO = 1900;


        assertTrue("AGENDAMENTO JÁ EXISTENTE!", Agendamento.validarAgendamento(agenda, DIA, MES, ANO, sala));
        assertTrue("NÚMERO DE PARTICIPANTES INVÁLIDO!", Agendamento.validarParticipantes(Participantes));
        assertTrue("DATA DE AGENDAMENTO INVÁLIDA!", Agendamento.validarData(DIA, MES, ANO));
    }
}
