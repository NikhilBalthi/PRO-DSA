package HashingLec19;

public class MaxTwoNonOverlappingSubarrays_Q2 {
    public static int maxTwoSubarrays(int[] arr) {
        int n = arr.length;
        if (n < 2) return 0; // Need at least two elements to form two subarrays

        // 1. leftMax[i] stores the maximum subarray sum from index 0 to i
        int[] leftMax = new int[n];
        int currMax = arr[0];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            leftMax[i] = Math.max(leftMax[i - 1], currMax);
        }

        // 2. rightMax[i] stores the maximum subarray sum from index i to n-1
        int[] rightMax = new int[n];
        currMax = arr[n - 1];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            currMax = Math.max(arr[i], currMax + arr[i]);
            rightMax[i] = Math.max(rightMax[i + 1], currMax);
        }

        // 3. Find the split point that maximizes the combined sum
        int maxTotalSum = Integer.MIN_VALUE;
        for (int i = 0; i < n - 1; i++) {
            // leftMax[i] handles left subarray, rightMax[i+1] handles right subarray
            maxTotalSum = Math.max(maxTotalSum, leftMax[i] + rightMax[i + 1]);
        }

        return maxTotalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, -5, 3, 5};
        System.out.println("Max sum of two non-intersecting subarrays: " + maxTwoSubarrays(arr));
        // Output: 10 -> Subarray 1: [1, 1] (sum = 2), Subarray 2: [3, 5] (sum = 8) -> 2 + 8 = 10
    }
}
