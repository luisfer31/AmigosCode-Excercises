import java.util.Arrays;

public class A6_NumberOfItems {
    public static void main(String[] args) {
        String[] array = {"luis", "Lili", "Vale", "Nicole", "Edward", "Kate"};
        System.out.println(numberOfItems(array));
    }

    public static int numberOfItems(String[] array){
//        int count = (int) Arrays.stream(array).count();
        return array.length;
    }
}
