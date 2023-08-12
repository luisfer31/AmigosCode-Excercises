package erase;

import java.util.HashMap;

public class E4 {
    public static void main(String[] args) {
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,8,8"};
        String str = input[0];
        String[] numbers = str.trim().split(",\\s*");
        System.out.println(occurrences(numbers));

    }

    public static String occurrences(String[] numbers) {
        HashMap<String, Integer> occurrencesMap = new HashMap<>();
        for (String e : numbers) {
            occurrencesMap.put(e, occurrencesMap.getOrDefault(e, 0) + 1);
        }

        String maxEle = "";
        int maxOccurrences = 0;
        for (String key : occurrencesMap.keySet()) {
            int occurrence = occurrencesMap.get(key);
            if (occurrence > maxOccurrences) {
                maxEle = key;
                maxOccurrences = occurrence;
            }
        }

        return maxEle;

    }
}
