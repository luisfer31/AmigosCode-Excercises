public class A4_larger {
    public static void main(String[] args) {
     int num1 = 2;
     int num2 = 4;
     int num3 = 4;
     larger(num1,num2);
     larger(num2,num1);
    }

    public static void larger(int num1, int num2){
        System.out.println(num1>num2?"The first number is larger":num1<num2?"The second number is larger":"The numbers are equal");
    }
}
