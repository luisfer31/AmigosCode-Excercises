import java.util.Scanner;

public class A_EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean flag = true;

        while (flag){
            System.out.println("Enter number");
            num = sc.nextInt();
            if (num % 2 == 0){
                System.out.println("The number "+ num + " is even" );
            }else {
                System.out.println("The number "+ num + " is odd" );
            }
        }
    }
}
