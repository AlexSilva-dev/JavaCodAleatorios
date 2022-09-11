package Principal;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;

public class PrimProg {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale( "pt", "BR");
        LocalDateTime hora = LocalDateTime.now();

        String nome = "Alex";
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        int dia = hoje.getDayOfMonth() ;
        String saudacao;

        if(hora.getHour() >= 0 && hora.getHour()<=12){
            saudacao = "Bom dia";
        } else if (hora.getHour()<18) {
            saudacao = "Boa tarde";
        } else{
            saudacao = "Boa noite";
        }

        System.out.println("Olá " + nome + ", " + saudacao.toLowerCase());
        System.out.print("\t\tHoje é " + diaSemana);
        System.out.println(" dia " + dia);
    }
}
