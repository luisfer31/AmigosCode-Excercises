import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class A2_Birthday {
    public static void main(String[] args) {
        int year = 1978;
        int month = 4;
        int day = 02;

        LocalDate dateOfBirth = LocalDate.of(year,month,day);
        System.out.println("Date of Birth: "+dateOfBirth);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(dateOfBirth.format(formatter));
    }
}
