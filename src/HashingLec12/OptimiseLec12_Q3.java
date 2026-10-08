package HashingLec12;

//Given a string array words, return an array of all characters that show up in all
// strings within the words (including duplicates).
// You may return the answer in any order.

//The most optimal way to solve this problem is to use a fixed-size frequency array.
//This method avoids destroying or recreating strings,
//making it much faster and more memory-efficient than the brute-force approach.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OptimiseLec12_Q3 {

    public static List<String> commonChars(String[] words) {
        // Step 1: Create an array to track the minimum frequency of each character

        int[] minFreq = new int[26];

        // Initialize the array with the highest possible values
        // so that the Math.min operation works correctly on the first pass

        Arrays.fill(minFreq, Integer.MAX_VALUE);

        // Step 2: Iterate through every word in the input
        for (String word : words) {
            int[] currentFreq = new int[26];

            //Count character frequencies for the current word
            for (int i = 0; i < word.length(); i++) {
                currentFreq[word.charAt(i) - 'a']++;
            }
            // Update the global minimum frequencies
            for (int i = 0; i < 26; i++) {
                minFreq[i] = Math.min(minFreq[i], currentFreq[i]);
            }
        }
        //Collect the result based on minimum frequencies
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minFreq[i] > 0 && minFreq[i] != Integer.MAX_VALUE) {
                result.add(String.valueOf((char) ('a' + i)));
                minFreq[i]--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String[] test1 = {"bella", "label", "roller"};
        System.out.println("Optimized Output 1: " + commonChars(test1));
        // Output: [e, l, l]

        String[] test2 = {"cool", "lock", "cook"};
        System.out.println("Optimized Output 2: " + commonChars(test2));
        // Output: [c, o]
    }
}
