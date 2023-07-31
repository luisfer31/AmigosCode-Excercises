import java.util.Arrays;

public class A9 {
    public static void main(String[] args) {
        int[] array = new int[11];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element ata index " + i + ": " + array[i]);
        }
    }
}
