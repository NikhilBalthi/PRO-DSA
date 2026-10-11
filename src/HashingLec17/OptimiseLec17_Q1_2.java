package HashingLec17;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/contest/biweekly-contest-103/problems/find-the-prefix-common-array-of-two-arrays/description/
//Find the Prefix Common Array of Two Arrays
public class OptimiseLec17_Q1_2 {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];

        // HashSet to store numbers we have seen so far
        Set<Integer> seen = new HashSet<>();
        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            // 1. Process element from Array A
            // If we have already seen A[i] (meaning it was seen in B earlier), it's common!
            if (seen.contains(A[i])) {
                commonCount++;
            } else {
                seen.add(A[i]);
            }

            // 2. Process element from Array B
            // If we have already seen B[i] (meaning it was seen in A earlier), it's common!
            if (seen.contains(B[i])) {
                commonCount++;
            } else {
                seen.add(B[i]);
            }

            // Special Case: If A[i] and B[i] are the same number at the same index
            if (A[i] == B[i]) {
                commonCount++;
            }

            // Store the running common count for index i
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
