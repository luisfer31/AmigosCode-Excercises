import java.util.Scanner;

public class A_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean prime = prime(num);
        System.out.println(prime ? num + " The number is prime" : num + " The number is not prime");

    }

    public static boolean prime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
