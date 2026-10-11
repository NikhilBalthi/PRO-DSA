package HashingLec14;

//Max Length of Consecutive Nums
public class BruteForceLec14_Q1 {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println("Max Length is "+LongestConsecutive(nums));
    }

    private static int LongestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int longestStreak = 0;

        // Try every number as the potential starting point of a sequence
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int currentStreak = 1;

            // Linearly search for the next consecutive numbers
            while (linearSearch(nums, currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }

        return longestStreak;
    }

    // Helper method to look for a target value in the array
    private static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
