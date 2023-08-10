public class A2_Tshirt_Loop_Values {
    public static void main(String[] args) {
        TshirtSizelm[] sizes = TshirtSizelm.values();
        values(sizes);
    }

    public static void values(TshirtSizelm[] sizes) {
        for (TshirtSizelm values : sizes) {
            String lowerCaseName = values.name().toLowerCase();
            System.out.println("Lowercase T shirt : " + lowerCaseName);
        }
    }
}
