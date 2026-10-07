package HashingLec12;

import java.util.HashMap;
import java.util.Map;
//First Unique Character In A String
public class OptimiseLec12_Q2 {

    private static int firstUniqChar(String s) {
        // Map to store: Key = Character, Value = Count of occurrences
        Map<Character, Integer> freqMap = new HashMap<>();
        int n = s.length();

        // Pass 1: Build the frequency map
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Pass 2: Loop through the string again to find the first character with a count of 1
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(freqMap.get(ch)==1){
                return i; // Return index of first unique character
            }
        }

        return -1; // Return -1 if no unique character is found
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("Index: " + firstUniqChar(s));
        // Expected Output: 2
    }

}
