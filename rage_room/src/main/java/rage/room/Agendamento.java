package rage.room;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
public class Agendamento {
    int participantes;
    String motivo;
    boolean obj;
    int sala;
    int dia;
    int mes;
    int ano;

    public Agendamento(int i, String string, boolean b, int j, int k, int l, int m) {
    }
    public static boolean validarData(int dia, int mes, int ano) {
        Date data = new Date();
        LocalDate dataLocal = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int diaAtual = dataLocal.getDayOfMonth();
        int mesAtual = dataLocal.getMonthValue();
        int anoAtual = dataLocal.getYear();


        if((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anoAtual >= ano  && mesAtual - mes >= 0 && diaAtual - dia >= 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validarAgendamento(List<Agendamento> agendamentos,int dia, int mes, int ano, int sala) {
        
        for (Agendamento agendamento : agendamentos) {
            if(agendamento.dia == dia && agendamento.ano == ano && agendamento.mes == mes && agendamento.sala == sala){
                return false;
            }
        }
        
        return true;
    }
    public static boolean validarParticipantes(int participantes){
        if(participantes >=1 && participantes <= 6){
            return true;
        }
        return false;
    }
}
