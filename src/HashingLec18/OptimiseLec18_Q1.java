package HashingLec18;

import java.util.HashMap;
import java.util.Map;

public class OptimiseLec18_Q1 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Max Length (HashMap): " + longestSubarrayHashMap(nums, k));
    }

    public static int longestSubarrayHashMap(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // [PrefixSum -> First Seen Index]
        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            // Case 1: If prefixSum itself equals k, subarray starts from index 0
            if (prefixSum == k) {
                maxLength = i + 1;
            }

            // Case 2: Check if (prefixSum - k) exists in our map history
            int target = prefixSum - k;
            if (map.containsKey(target)) {
                maxLength = Math.max(maxLength, i - map.get(target));
            }

            // CRITICAL: Only add prefixSum to map if it doesn't exist yet.
            // This preserves the earliest index to ensure maximum length.
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        return maxLength;
    }
}
