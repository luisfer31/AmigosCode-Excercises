public class A1_EnumsTshirt {
    enum TshirtSize {
        S, M, L, XL, XXL
    }

    public static void main(String[] args) {
        TshirtSize size = TshirtSize.XL;
        System.out.println("The size of the shirt is: " + size);
    }
}
