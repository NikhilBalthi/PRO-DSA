package HashingLec16;

import java.util.HashMap;
import java.util.Map;

public class BruteForceLec16_Q1 {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;

        // Outer loop 'i' sets the START of the subarray
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            // Inner loop 'j' expands the END of the subarray forward
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j]; // Continuously add elements to the running sum

                // Check if the current window sum matches our target k
                if (currentSum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        System.out.println("Total subarrays " + subarraySum(nums, k));
        // Output: 2 -> The subarrays are [1, 1] at indices 0-1 and [1, 1] at indices 1-2
    }

//    TC: O(N^2)
    // SC: O(1)
}
