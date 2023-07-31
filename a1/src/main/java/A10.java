import java.util.Scanner;

public class A10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers");
        int amount = sc.nextInt();
        int[] array = new int[amount];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        System.out.println("Total sum: " + sum);
    }
}
