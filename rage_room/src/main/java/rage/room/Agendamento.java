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
        participantes = i;
        motivo = string;
        obj = b;
        sala = j;
        dia = k;
        mes = l;
        ano = m;
    }
    public static boolean validarData(int dia, int mes, int ano) {
        Date data = new Date();
        LocalDate dataLocal = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        int anoAtual = dataLocal.getYear();


        if((dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12) && (anoAtual <= ano )) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validarAgendamento(List<Agendamento> agendamentos,int dia, int mes, int ano, int sala) {
        
      for (int j = 0; j < agendamentos.size(); j++) {
          
       
            if(agendamentos.get(j).dia == dia && agendamentos.get(j).ano == ano && agendamentos.get(j).mes == mes && agendamentos.get(j).sala == sala){
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
