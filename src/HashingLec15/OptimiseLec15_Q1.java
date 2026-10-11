package HashingLec15;

import java.util.HashMap;

public class OptimiseLec15_Q1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int k = 1;

        // Calling the method directly without creating an object
        int result = countKDifference(nums, k);
        System.out.println("Total pairs: " + result); // Output: 4
    }

    // Added 'static' keyword here so it can be called directly by main
    public static int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for (int i : nums) {
            res += map.getOrDefault(i - k, 0) + map.getOrDefault(i + k, 0);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return res;
    }
}
