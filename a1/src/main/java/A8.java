public class A8 {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d"};
        for (int i = 0; i < a.length; i++) {
            System.out.println("Element ata index " + i + ": " + a[i]);
        }

        for (String element : a) {
            System.out.println(element);
        }
        System.out.println();

        for (int i = 0; i <= 10; i++) {
            System.out.println("Value: " + i);
        }
        System.out.println();
        for (int i = 10; i >= 0; i--) {
            System.out.println("Value: " + i);
        }
    }
}
