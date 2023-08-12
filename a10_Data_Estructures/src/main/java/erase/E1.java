package erase;

import java.util.HashMap;

public class E1 {
    public static void main(String[] args) {
        String[] input = {"1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8"};
        String strNUm = input[0];

        String[] numbers = strNUm.trim().split(",\\s*");

        HashMap<String, Integer> occurrenceMap = new HashMap<>();
        for (String e:numbers){
            occurrenceMap.put(e,occurrenceMap.getOrDefault(e,0)+1);
        }

        for (String key: occurrenceMap.keySet()){
            System.out.println(key + " " + occurrenceMap.get(key));
        }
    }
}
