public class A3_Equals {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int num3 = 15;
        boolean equals = equals(num1, num2);
        boolean equals1 = equals(num1, num3);
        System.out.println(num1 + " and " + num2 + " are equal: " + equals);
        System.out.println(num1 + " and " + num3 + " are equal: " + equals1);
    }

    public static boolean equals(int num1, int num2){
        return num1==num2;
    }
}
