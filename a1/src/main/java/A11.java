import java.util.Arrays;

public class A11 {
    public static void main(String[] args) {
        String[] array = {"i", "sure", "do", "love", "bees"};
        String[] arrayUpper = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayUpper[i] = array[i].substring(0,1).toUpperCase()+array[i].substring(1);
        }

        System.out.println(Arrays.toString(arrayUpper));
    }
}
