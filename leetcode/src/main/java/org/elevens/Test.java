package org.elevens;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // rupee 10 --> change = 1 * 10 = 10
        // rupee 10 --> change = 2 * 5 = 10
        // rupee 10 --> change = 5 * 2 = 10
        int[] denominations = {1, 2, 5}; // Sample denominations
        int target = 10; // Target denomination

        List<List<Integer>> allCombinations = getCombinations(denominations, target);

        if (allCombinations.isEmpty()) {
            System.out.println("No combinations found.");
        }
        else {

            System.out.println("Combinations for target denomination " + target + ":");

            for (List<Integer> combination : allCombinations) {
                System.out.println(combination);
            }
        }
    }

    public static List<List<Integer>> getCombinations(int[] denominations, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        //Get Next Comb
        findCombinations(denominations, target, 0, new ArrayList<>(), combinations);
        //Add Existing
        return combinations;
    }

    private static void findCombinations(int[] denominations, int target, int index, List<Integer> presentCombinations,
                                         List<List<Integer>> finalCombRes) {

        if (target == 0) {
            finalCombRes.add(new ArrayList<>(presentCombinations));
            return;
        }

        for (int i = index; i < denominations.length; i++) {
            int denomination = denominations[i];
            if (denomination <= target) {
                presentCombinations.add(denomination);
                findCombinations(denominations, target - denomination, i, presentCombinations, finalCombRes);
                presentCombinations.remove(presentCombinations.size() - 1);
            }
        }
    }
}
