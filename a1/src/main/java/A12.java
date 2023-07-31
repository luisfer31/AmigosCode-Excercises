public class A12 {
    public static void main(String[] args) {
        String[] array = {"you", "are", "how", "hello"};
//        for (int i = array.length-1; i >= 0; i--) {
//            System.out.print(array[i]);
//            if (i != 0){
//                System.out.print(" ");
//            }else {
//                System.out.print("?");
//            }
//        }
        String result ="";
        for (int i = array.length-1; i >=0 ; i--) {
            result += array[i]+" ";
        }
        System.out.println(result+"?");
    }
}
