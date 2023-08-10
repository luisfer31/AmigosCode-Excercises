import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class A3_BirthdayPlus100 {
    public static void main(String[] args) {
        int year = 1978;
        int month = 4;
        int day = 02;

        // LocalDate
        LocalDate dateOfBirth = LocalDate.of(year, month, day);

        LocalDate newDate = dateOfBirth.plusDays(100);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println("New Date after adding 100 day: " + newDate.format(formatter));
    }
}
