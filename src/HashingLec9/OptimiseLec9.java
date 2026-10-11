package HashingLec9;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimiseLec9 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, -1, 2, 1};
        int k = 3;

        System.out.println("--- LARGEST SUBARRAYS ---");
        countLargestSubarrayWithSumK(nums, k);

        System.out.println("\n--- SMALLEST SUBARRAYS ---");
        countSmallestSubarrayWithSumK(nums, k);
    }

    // 1. Find and print subarrays with MAXIMUM length that sum to k
    public static void countLargestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // [PrefixSum -> First Seen Index]
        map.put(0, -1);

        int prefixSum = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int target = prefixSum - k;

            if (map.containsKey(target)) {
                int length = i - map.get(target);
                if (length > maxLength) {
                    maxLength = length; // Track the largest size found
                }
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        // Print matches of maxLength
        int count = 0;
        prefixSum = 0;
        map.clear();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int target = prefixSum - k;

            if (map.containsKey(target)) {
                int startIdx = map.get(target) + 1;
                if (i - map.get(target) == maxLength) {
                    count++;
                    // Print the matching subarray
                    int[] subArray = Arrays.copyOfRange(nums, startIdx, i + 1);
                    System.out.println("Match " + count + ": " + Arrays.toString(subArray));
                }
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        System.out.println("Total count: " + count);
    }

    // 2. Find and print subarrays with MINIMUM length that sum to k
    public static void countSmallestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); // [PrefixSum -> Most Recent Index]
        map.put(0, -1);

        int prefixSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int target = prefixSum - k;

            if (map.containsKey(target)) {
                int length = i - map.get(target);
                if (length < minLength) {
                    minLength = length; // Track the smallest size found
                }
            }
            map.put(prefixSum, i);
        }

        // Print matches of minLength
        int count = 0;
        prefixSum = 0;
        map.clear();
        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int target = prefixSum - k;

            if (map.containsKey(target)) {
                int startIdx = map.get(target) + 1;
                if (i - map.get(target) == minLength) {
                    count++;
                    // Print the matching subarray
                    int[] subArray = Arrays.copyOfRange(nums, startIdx, i + 1);
                    System.out.println("Match " + count + ": " + Arrays.toString(subArray));
                }
            }
            map.put(prefixSum, i);
        }
        System.out.println("Total count: " + count);
    }
}
