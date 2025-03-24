package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FuzzySearchTest {
 @Test
    public void testLinearSearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int index = FuzzySearch.linearSearch(sortedFuzzies);
        assertEquals(1000, index);
    }

    @Test
    public void testLinearSearchOnRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int index = FuzzySearch.linearSearch(randomFuzzies);
        assert (index >= 0 && index < randomFuzzies.size());
    }

    @Test
    public void testBinarySearchOnSortedList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        int index = FuzzySearch.binarySearch(sortedFuzzies);
        assertEquals(1000, index);
    }

    @Test
    public void testBinarySearchOnRandomList() {
        FuzzyListGenerator generator = new FuzzyListGenerator();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
        int index = FuzzySearch.binarySearch(randomFuzzies);
        assertEquals(-1, index);
    }
}
