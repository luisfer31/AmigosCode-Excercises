import java.util.ArrayList;
import java.util.List;

public class A3_Longest_String {
    public static void main(String[] args) {
        String[] words = {"hello", "preferences", "hella", "ola", "preferencea", "ciao", "preferences"};
        String[] words1 = {"hello", "ola", "bye", "ciao"};
        String[] words2 = {"hello", "hello", "ola", "bye", "ciao"};
        String[] words3 = {"hello", "bingo", "ola", "bye", "ciao"};
        System.out.println(longestString(words));
        System.out.println(longestString(words1));
        System.out.println(longestString(words2));
        System.out.println(longestString(words3));

    }

    private static String longestString(String[] words) {
        String answer = "";
        List<String> str = new ArrayList<>();
        int maxLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == maxLength) {
                str.add(words[i]);
            }
        }
        return answer = str.stream().distinct().toList().toString();
    }
}
