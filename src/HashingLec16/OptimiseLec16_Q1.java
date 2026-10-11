package HashingLec16;

import java.util.HashMap;
import java.util.Map;

public class OptimiseLec16_Q1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println("Total subarrays with sum " + k + ": " + subarraySum(nums, k));
        // Output: 2 ([1,1] at indices 0-1 and indices 1-2)
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        // Map to store: [Prefix Sum -> Frequency of that Prefix Sum]
        Map<Integer, Integer> map = new HashMap<>();

        // Base case: prefix sum 0 occurs once (handles subarrays starting from index 0)
        map.put(0, 1);

        for (int num : nums) {
            currentSum += num; // Update running prefix sum

            // Check if (currentSum - k) exists in the map
            if (map.containsKey(currentSum - k)) {
                count += map.get(currentSum - k); // Add frequency of the matching prefix sum
            }

            // Update the map with the current prefix sum frequency
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

    //TC : O(N)
    //SC : O(N)
}
