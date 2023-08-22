import java.util.Arrays;
import java.util.List;

public class Example3MethodReference {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // 1 way
        numbers.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);

        // 2 way
        numbers.stream().filter(Example3MethodReference::isEven).forEach(System.out::println);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
