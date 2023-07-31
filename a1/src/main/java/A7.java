import java.util.Arrays;

public class A7 {
    public static void main(String[] args) {
        String[] array = {"a", "b", "c", "d"};
        String[] array1 = array;
        array1[0]="z";
        String[] array2 = Arrays.copyOf(array,8);
        array2[0]="y";



        for (int i = 0; i < array.length; i++) {
            System.out.println("Element ata index " + i + ": " + array[i]);
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.println("Element ata index " + i + ": " + array1[i]);
        }

        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Element ata index " + i + ": " + array2[i]);
        }
    }
}
