import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String result = "";
        if (!a.equals(b)){
            result = "The string (a) are not equal than (b)";
        }else {
            result = "The string (a) are equal than (b)";
        }
        System.out.println(result);
    }
}
