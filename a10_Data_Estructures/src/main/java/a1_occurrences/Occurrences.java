package a1_occurrences;

import java.util.HashMap;

public class Occurrences {

    public static HashMap<String, Integer> countOccurrences(String[] input) {
        HashMap<String, Integer> occurrencesMap = new HashMap<>();
        for (String element : input) {
            String[] elements = element.trim().split(",\\s*");
            for (String e : elements) {
                occurrencesMap.put(e, occurrencesMap.getOrDefault(e, 0) + 1);
            }
        }
        return occurrencesMap;
    }

    public static void main(String[] args) {
        String[] input = {"1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8"};
        HashMap<String, Integer> occurrences = countOccurrences(input);
        for (String key : occurrences.keySet()) {
            System.out.println("\"" + key + "\": " + occurrences.get(key));
        }
    }
}
