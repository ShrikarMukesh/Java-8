package streamnew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Given an array of strings strs , group the anagrams together. You can return the answer in any order.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
Input: strs = ["Eat","Tea","Tan","ate","nat","bat"]
Output: [["bat"],["nat","Tan"],["ate","Eat","Tea"]]
 */
public class AnagramGroups {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toLowerCase().toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);

            if (anagramGroups.containsKey(sortedWord)) {
                anagramGroups.get(sortedWord).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                anagramGroups.put(sortedWord, group);
            }
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] strs = {"Eat", "Tea", "Tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
