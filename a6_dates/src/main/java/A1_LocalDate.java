import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class A1_LocalDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        // format

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("Today's Date: " + currentDate.format(dateFormatter));
        System.out.println("Current Date and Time: " + currentDateTime.format(dateTimeFormatter));
    }
}
