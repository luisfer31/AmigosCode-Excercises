import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = "";

        if (a>b){
            c = String.valueOf(a);
        }else {
            c=String.valueOf(b);
        }if (a==b){
            c = "a and b are equals";
        }
        System.out.println(c);
    }
}
