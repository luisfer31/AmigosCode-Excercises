public class A5_firstUpperCase {
    public static void main(String[] args) {
        System.out.println(upperCaseFirst("luisM Backend"));
    }

    public static String upperCaseFirst(String str) {
        if (str==null||str.isEmpty()){
            return str;
        }
        String upperCaseFirst = str.substring(0, 1).toUpperCase() + str.substring(1);
        return upperCaseFirst;
    }
}
