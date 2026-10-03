package HashingLec6;

//Find Sum of Range [l...r]where l<=r using prefix sum
public class BruteForceLec6 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 2, 1, 4};

        // Define multiple queries as pairs of [l, r]
        int[][] queries = {
                {2, 5}, // Query 1: sum from index 2 to 5
                {0, 3}, // Query 2: sum from index 0 to 3
                {1, 4}  // Query 3: sum from index 1 to 4
        };

        // For each query, we call the brute-force getSum method
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int totalSum = getSum(l, r, arr);
            System.out.println("Query " + (i + 1) + " -> Sum of range [" + l + "..." + r + "] is: " + totalSum);
        }
    }

    // Brute force method: Iterates from l to r for every single call
    // Time Complexity per query: O(N)
    public static int getSum(int l, int r, int[] arr) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
