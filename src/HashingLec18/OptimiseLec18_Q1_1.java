package HashingLec18;

// Two Pointer approach
public class OptimiseLec18_Q1_1 {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println("Max Length (Two-Pointer): " + longestSubarrayTwoPointer(nums, k));
    }

    public static int longestSubarrayTwoPointer(int[] arr, int k) {
        int left = 0, right = 0;
        int currentSum = 0;
        int maxLength = 0;
        int n = arr.length;

        while (right < n) {
            //keep expanding
            currentSum += arr[right];

            // If sum exceeds k, shrink the window from the left
            while (left <= right && currentSum > k) {
                currentSum -= arr[left];
                left++;
            }

            // Check if we hit the target sum
            if (currentSum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++; // Expand window to the right
        }
        return maxLength;
    }

    //
    //Approach	    Time Complexity	Space Complexity	Array Constraint
    //Brute Force	O(N²)	O(1)	Works on all arrays
    //HashMap	    O(N)	O(N)	Works on all arrays (including negatives)
    //Two-Pointer	O(N)	O(1)	Only works for positive numbers/zeros

}
