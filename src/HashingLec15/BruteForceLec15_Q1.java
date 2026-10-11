package HashingLec15;

public class BruteForceLec15_Q1 {

        public static void main(String[] args) {
            int[] nums = {1, 2, 2, 1};
            int k = 1;

            // Calling the static method directly
            int result = countKDifferenceBruteForce(nums, k);
            System.out.println("Total pairs " + result); // Output: 4
        }

        public static int countKDifferenceBruteForce(int[] nums, int k) {
            int count = 0;

            // Outer loop selects the first element
            for (int i = 0; i < nums.length; i++) {
                // Inner loop selects the second element (always ahead of i to avoid duplicating pairs)
                for (int j = i + 1; j < nums.length; j++) {

                    // Check if the absolute difference between the two numbers is equal to k
                    if (Math.abs(nums[i] - nums[j]) == k) {
                        count++;
                    }
                }
            }

            return count;
        }

}
