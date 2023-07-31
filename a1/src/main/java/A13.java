public class A13 {
    public static void main(String[] args) {
        String values = "0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0.0;
        String[] arrayVal = values.split(",");
//        for (int i = 0; i < arrayVal.length; i++) {
//            result += Double.parseDouble(arrayVal[i]);
//        }
        for (String num : arrayVal) {
            result += Double.parseDouble(num);
        }
        System.out.println("Total = " + result);
    }
}
