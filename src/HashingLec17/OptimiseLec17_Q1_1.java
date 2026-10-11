package HashingLec17;

import java.util.Arrays;

//https://leetcode.com/contest/biweekly-contest-103/problems/find-the-prefix-common-array-of-two-arrays/description/
//Find the Prefix Common Array of Two Arrays
public class OptimiseLec17_Q1_1 {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        // Frequency array to keep track of counts of elements (since numbers are 1 to N)
        // Size is n + 1 because the numbers are 1-indexed up to N
        int[] frequency = new int[n + 1];

        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            // Process element from array A
            frequency[A[i]]++;
            if (frequency[A[i]] == 2) {
                commonCount++; // It appeared in both arrays
            }

            // Process element from array B
            frequency[B[i]]++;
            if (frequency[B[i]] == 2) {
                commonCount++; // It appeared in both arrays
            }

            // Store the running common count for prefix index i
            C[i] = commonCount;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        int[] result = findThePrefixCommonArray(A, B);
        System.out.println("Prefix Common Array: " + Arrays.toString(result));
        // Output: [0, 2, 3, 4]
    }
}
