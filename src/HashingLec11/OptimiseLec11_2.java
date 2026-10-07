package HashingLec11;

import java.util.HashMap;
import java.util.Map;

public class OptimiseLec11_2 {
    public static void main(String[] args) {
        // --- Test Example 1 ---
        int[] arr1 = {1, 1, 1, 1, 1};
        int x1 = 1;
        System.out.println("Example 1 Output: " + findFrequency(arr1, x1));
        // Expected Output: 5

        // --- Test Example 2 ---
        int[] arr2 = {1, 2, 3, 3, 2, 1};
        int x2 = 2;
        System.out.println("Example 2 Output: " + findFrequency(arr2, x2));
        // Expected Output: 2
    }

    // Method to calculate the frequency using a HashMap
    public static int findFrequency(int[] arr, int x) {
        Map<Integer,Integer> map = new HashMap<>();

        //Build the frequency map
        for(int num : arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        //Return frequency of x (returns 0 if x doesn't exist)
        return map.getOrDefault(x,0);
    }
}
