import java.time.LocalDate;
import java.time.Period;

public class A4_CalculateAge {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1978, 04, 02);
        LocalDate currentDay = LocalDate.now();
        int age = calculateAge(birthDay, currentDay);
        System.out.println("Age: " + age);

    }

    public static int calculateAge(LocalDate birthDay, LocalDate currentDate) {
        Period period = Period.between(birthDay, currentDate);
        int years = period.getYears(); // return years
        int months = period.getMonths();
        int days = period.getDays();

        if (months < 0 || (months == 0 && days < 0)) {
            years--;
        }
        return years;
    }
}
