package HashingLec14;

import java.util.HashSet;
import java.util.Set;

//Max Length of Consecutive Nums
public class OptimiseLec14_Q1 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Max Length is " + LongestConsecutive(nums)); // Output: 4
    }

    private static int LongestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        // Step 1: Put all numbers into a HashSet for O(1) lookups
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the array to find sequences
        for (int num : nums) {
            // Check if 'num' is the START of a sequence
            // If (num - 1) is in the set, then 'num' is NOT the start. Skip it!
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Expand the sequence forward
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the maximum length found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
