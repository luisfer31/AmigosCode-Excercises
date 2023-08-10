package a2_num_occurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxOccurrencesFinderTest {
    @Test
    void testFindMaxOccurrences(){
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,8,8"};
        String result = NumOccurrences.findMaxOccurrences(input);
        assertEquals("1",result);
    }
}
