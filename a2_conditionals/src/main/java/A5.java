public class A5 {
    public static void main(String[] args) {
        String brand = "LuisuM_JDevu".toLowerCase();
        int count = 0;

        for (int i = 0; i < brand.length(); i++) {
            if (brand.charAt(i) == 'u') {
                ++count;
                System.out.println("Position: " + i + " count = " + count);
            }
        }
    }
}
