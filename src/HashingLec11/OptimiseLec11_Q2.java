package HashingLec11;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimiseLec11_Q2 {

    // Method to find indices of the two numbers that add up to the target
    public static int[] twoSum(int[] nums, int target) {
        // Map to store: Key = Number, Value = Index of that number
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int complement = target - currentNum;

            // If the complement is already in the map, we found the pair!
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            // Otherwise, put the current number and its index into the map
            map.put(currentNum,i);
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        // --- Test Case 1 ---
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("Test Case 1 Indices: " + Arrays.toString(result1));
        // Expected Output: [0, 1] (because nums[0] + nums[1] == 9)

        // --- Test Case 2 ---
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("Test Case 2 Indices: " + Arrays.toString(result2));
        // Expected Output: [1, 2] (because nums[1] + nums[2] == 6)

        // --- Test Case 3 ---
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("Test Case 3 Indices: " + Arrays.toString(result3));
        // Expected Output: [0, 1]
    }
}
