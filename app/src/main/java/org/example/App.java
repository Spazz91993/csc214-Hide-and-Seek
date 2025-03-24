package org.example;

import java.util.ArrayList;

public class App {
     public static void main(String[] args) {
        FuzzyListGenerator generator = new FuzzyListGenerator();

        ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
        ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();

        System.out.println("Linear Search - Sorted List: " + FuzzySearch.linearSearch(sortedFuzzies));
        System.out.println("Linear Search - Random List: " + FuzzySearch.linearSearch(randomFuzzies));

        System.out.println("Binary Search - Sorted List: " + FuzzySearch.binarySearch(sortedFuzzies));
        System.out.println("Binary Search - Random List: " + FuzzySearch.binarySearch(randomFuzzies));
    }
}
