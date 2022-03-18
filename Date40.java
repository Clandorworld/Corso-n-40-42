import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date40 {
    public static void main(String[] args){
        LocalDate x = LocalDate.now();
        LocalTime y = LocalTime.now();
        System.out.println(x); //Anno, mese, giorno
        DateTimeFormatter z = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(x.format(z)); //In questo modo la formatterà la data come scelto sopra
        System.out.println(y);
        DateTimeFormatter t = DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy");
        System.out.println(x.format(t)); //In questo modo la formatterà la data come scelto sopra
    }
}