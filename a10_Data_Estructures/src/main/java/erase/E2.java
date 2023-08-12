package erase;

import java.util.HashMap;

public class E2 {
    public static void main(String[] args) {
        String[] input = {"1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8"};
        String str = input[0];
        String[] numbers = str.trim().split(",\\s*");

        HashMap<String, Integer> occurrencesMap = new HashMap<>();

        for (String e:numbers){
            occurrencesMap.put(e,occurrencesMap.getOrDefault(e,0)+1);
        }
        occurrencesMap.forEach((key, value) -> System.out.println(key + " " +value));

    }
}
