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
        int DIA, MES, ANO, sala;
        List<Agendamento> agenda = new ArrayList<>();
        Agendamento a1 = new Agendamento(3,"Filósofo",false,2,20,10,2021);
        Agendamento a2 = new Agendamento(1,"Filósofo",false,3,20,10,2021);
        Agendamento a3 = new Agendamento(5,"Filósofo",false,4,20,10,2021);
       agenda.add(a1);
       agenda.add(a2);
       agenda.add(a3);

        sala = 3;
        DIA = 30;
        MES = 11;
        ANO = 2021;


        assertTrue("AGENDAMENTO JÁ EXISTENTE!", Agendamento.validarAgendamento(agenda, DIA, MES, ANO, sala));
    }
    @Test
    public void validarAgendamentoFracasso() throws Exception {
        int DIA, MES, ANO, sala;
        List<Agendamento> agenda = new ArrayList<>();
        Agendamento a1 = new Agendamento(3,"Filósofo",false,2,20,10,2021);
        Agendamento a2 = new Agendamento(1,"Filósofo",false,3,20,10,2021);
        Agendamento a3 = new Agendamento(5,"Filósofo",false,4,20,10,2021);
       agenda.add(a1);
       agenda.add(a2);
       agenda.add(a3);

        sala = 3;
        DIA = 20;
        MES = 10;
        ANO = 2021;


        assertTrue("AGENDAMENTO JÁ EXISTENTE!", Agendamento.validarAgendamento(agenda, DIA, MES, ANO, sala));
    }
    
    @Test    
    public void excluirAgendamento() throws Exception {
        int DIA, MES, ANO, sala;
        List<Agendamento> agenda = new ArrayList<>();
        Agendamento a1 = new Agendamento(3,"Filósofo",false,2,20,10,2021);
        Agendamento a2 = new Agendamento(1,"Filósofo",false,3,21,10,2021);
        Agendamento a3 = new Agendamento(5,"Filósofo",false,4,22,10,2021);
       agenda.add(a1);
       agenda.add(a2);
       agenda.add(a3);

        sala = 3;
        DIA = 21;
        MES = 10;
        ANO = 2021;
        System.out.println("Antes");
        for(int j = 0; j < agenda.size();j++){
    System.out.println("Dia: "+agenda.get(j).dia);}
    assertTrue("Agendamento não encontrado", Agendamento.excluirAgendamento(agenda, DIA, MES, ANO, sala));
    System.out.println("Depois");
    for(int j = 0; j < agenda.size();j++){
        System.out.println("Dia: "+agenda.get(j).dia);}
    }

    @Test    
    public void excluirAgendamentoFracasso() throws Exception {
        int DIA, MES, ANO, sala;
        List<Agendamento> agenda = new ArrayList<>();
        Agendamento a1 = new Agendamento(3,"Filósofo",false,2,20,10,2021);
        Agendamento a2 = new Agendamento(1,"Filósofo",false,3,20,10,2021);
        Agendamento a3 = new Agendamento(5,"Filósofo",false,4,20,10,2021);
       agenda.add(a1);
       agenda.add(a2);
       agenda.add(a3);

        sala = 3;
        DIA = 20;
        MES = 10;
        ANO = 2022;
        for(int j = 0; j < agenda.size();j++){
            System.out.println(agenda.get(j));}
            assertTrue("Agendamento não encontrado", Agendamento.excluirAgendamento(agenda, DIA, MES, ANO, sala));
            for(int j = 0; j < agenda.size();j++){
                System.out.println(agenda.get(j));}
    }

    @Test
    public void validarParticipantes() throws Exception {
        int Participantes = 5;

        assertTrue("NÚMERO DE PARTICIPANTES INVÁLIDO!", Agendamento.validarParticipantes(Participantes));
    }
    @Test
    public void validarParticipantesFracasso() throws Exception {
        int Participantes = 7;

        assertTrue("NÚMERO DE PARTICIPANTES INVÁLIDO!", Agendamento.validarParticipantes(Participantes));
    }

    @Test
    public void validarData() throws Exception {
        int DIA, MES, ANO;
        DIA = 29;
        MES = 12;
        ANO = 2021;

        assertTrue("DATA DE AGENDAMENTO INVÁLIDA!", Agendamento.validarData(DIA, MES, ANO));
    }
    @Test
    public void validarDataFracasso() throws Exception {
        int DIA, MES, ANO;
        DIA = 32;
        MES = 13;
        ANO = 1989;

        assertTrue("DATA DE AGENDAMENTO INVÁLIDA!", Agendamento.validarData(DIA, MES, ANO));
    }
    @Test
    public void validarMotivo() throws Exception {
        String motivo = "Filósofo";

        assertTrue("Motivo INVÁLIDO!", Agendamento.validarMotivo(motivo));
    }

    @Test
    public void validarMotivoFracasso() throws Exception {
        String motivo = "FilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofoFilósofo";

        assertTrue("Motivo INVÁLIDO!", Agendamento.validarMotivo(motivo));
    }
    
    @Test
    public void validarObj() throws Exception {
        boolean obj = true;
        int objs = 4;
        List<String> objt = new ArrayList<>();
        objt.add("Martelo");
        objt.add("Marreta");
        objt.add("Machado");
        objt.add("PC");
        objt.add("foto da sogra");
        if(obj){
            System.out.println("Escolha o objeto a ser levado!");
            for(int i = 0;i<objt.size();i++){
                System.out.println(i + ". " + objt.get(i));
            }
        assertTrue("Objeto INVÁLIDO!", Agendamento.validarObj(objt,objs));
        System.out.println("Objeto Levado: " + objt.get(objs));
    }


    
}
    @Test
    public void validarObjFracasso() throws Exception {
        boolean obj = true;
        int objs = 7;
        List<String> objt = new ArrayList<>();
        objt.add("Martelo");
        objt.add("Marreta");
        objt.add("Machado");
        objt.add("PC");
        objt.add("foto da sogra");
        if(obj){
            System.out.println("Escolha o objeto a ser levado!");
            for(int i = 0;i<objt.size();i++){
                System.out.println(i + ". " + objt.get(i));
            }
        assertTrue("Objeto INVÁLIDO!", Agendamento.validarObj(objt,objs));
        System.out.println("Objeto Levado: " + objt.get(objs));
    }


    
}
}

