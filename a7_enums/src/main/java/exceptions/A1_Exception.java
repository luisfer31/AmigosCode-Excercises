package exceptions;

import java.util.Arrays;

public class A1_Exception {
    public static void main(String[] args) {
        int sum = 0;
        args= new String[]{"1", "2", "a", "b", "foo", "3"};
        System.out.println(Arrays.toString(args));
        StringBuilder nonIntValues = new StringBuilder();

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                sum += num;
            } catch (NumberFormatException e) {
                if (nonIntValues.length() > 0) {
                    nonIntValues.append(", ");
                }
                nonIntValues.append(arg);
            }
        }

        System.out.println("Sum: " + sum);

        if (nonIntValues.length() > 0) {
            System.out.println("and " + nonIntValues + " are not numbers.");
        }
    }
}
