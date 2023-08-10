package a2_num_occurrences;

import java.util.HashMap;

public class NumOccurrences {

    public static String findMaxOccurrences(String[] input) {
        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        for (String element : input) {
            String[] elements = element.trim().split(",\\s*");
            for (String e : elements) {
                occurrenceMap.put(e, occurrenceMap.getOrDefault(e, 0) + 1);
            }
        }

        String maxElement = "";
        int maxOccurrence = 0;
        for (String key : occurrenceMap.keySet()) {
            int occurrences = occurrenceMap.get(key);
            if (occurrences > maxOccurrence) {
                maxElement = key;
                maxOccurrence = occurrences;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,8,8"};
        System.out.println("Input array: " + input[0]);
        String result = findMaxOccurrences(input);
        System.out.println("Element with the most occurrences: " + result);

    }
}
