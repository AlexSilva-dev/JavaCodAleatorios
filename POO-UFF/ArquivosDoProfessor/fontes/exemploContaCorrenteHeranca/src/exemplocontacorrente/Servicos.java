package exemplocontacorrente;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Servicos {

    public static String dataHoje() {
        DateTimeFormatter dataFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        String hoje = dataFormato.format(localDate);
        return hoje;
    }

    public static String formataDinheiro(Double valor) {
        return NumberFormat.getCurrencyInstance().format(valor);
    }

}
