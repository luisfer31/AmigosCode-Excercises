import java.util.Arrays;

public class A2 {
    public static void main(String[] args) {
        String input = "   amig os cod e  ";
        System.out.println("Input: " + input);
        System.out.println("Transform input: " + extracted(input));
    }

    private static String extracted(String input) {
        if (input==null||input.isEmpty()){
            return "";
        }
        String[] erase = input.split(" ");
        String result = "";
        for (String letter : erase) {
            result += letter;
        }
        return result;
    }
}
