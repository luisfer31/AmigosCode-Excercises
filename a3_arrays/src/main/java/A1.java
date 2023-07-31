import java.util.Arrays;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reversed(sc);
    }

    private static void reversed(Scanner sc) {
        String[] input = sc.next().split("");
        System.out.println("Input: "+ Arrays.toString(input));
        System.out.print("Reversed: ");
        for (int i = input.length-1; i >=0 ; i--) {
            System.out.print(input[i]);
        }

    }
}
