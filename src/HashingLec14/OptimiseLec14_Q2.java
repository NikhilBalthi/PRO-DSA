package HashingLec14;

import java.util.HashMap;
import java.util.Map;

// Longest SubArray With ZeroSum - Optimized O(N) Version
public class OptimiseLec14_Q2 {
    public static void main(String[] args) {
        int[] nums = {15, -2, 2, -8, 1, 7, 10, 23};

        System.out.println("Max Length of Zero-Sum Subarray is: " + maxLength(nums));
        // Output: 5 (corresponding to the subarray: [-2, 2, -8, 1, 7])
    }

    private static int maxLength(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        // Map to store: [Prefix Sum -> First Seen Index]
        Map<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLength = 0;

        // Base case: A prefix sum of 0 conceptually happens before the array starts (at index -1)
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            prefixSum += arr[i];

            // If this sum has been seen before, a subarray with sum 0 exists
            if (map.containsKey(prefixSum)) {
                int prevIndex = map.get(prefixSum);
                int currLength = i - prevIndex; // Distance from the first time we saw this sum

                maxLength = Math.max(maxLength, currLength);
            } else {
                // Only add the sum if it doesn't exist to keep the EARLIEST index
                map.put(prefixSum, i);
            }
        }

        return maxLength;
    }
}
