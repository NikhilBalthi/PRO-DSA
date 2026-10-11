package HashingLec17;

import java.util.Arrays;

//https://leetcode.com/contest/biweekly-contest-103/problems/find-the-prefix-common-array-of-two-arrays/description/
//Find the Prefix Common Array of Two Arrays
public class BruteForceLec17_Q1 {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        // Loop 'i' represents our current prefix boundary (from 0 to i)
        for (int i = 0; i < n; i++) {
            int commonCount = 0;

            // Pick an element from array A within the current prefix [0...i]
            for (int x = 0; x <= i; x++) {

                // Search for a match in array B within the current prefix [0...i]
                for (int y = 0; y <= i; y++) {
                    if (A[x] == B[y]) {
                        commonCount++;
                        break; // Match found for A[x], stop searching inside B
                    }
                }
            }

            // Store the total common elements found for prefix i
            C[i] = commonCount;
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};

        int[] result = findThePrefixCommonArray(A, B);
        System.out.println("Prefix Common Array " + Arrays.toString(result));
        // Output: [0, 2, 3, 4]
    }

    //Time Complexity: O(N^3) or O(N^2) depending
    // on the strict bounds — Because of the three nested loops
    // (i, x, and y), this takes a lot of redundant steps for larger inputs.
    //Space Complexity: O(1) — Uses absolutely no extra memory storage besides the required output array C
}
