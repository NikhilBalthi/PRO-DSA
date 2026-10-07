package HashingLec11;

import java.util.Scanner;

public class BruteForceLec11_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) return;

        // 1. Read the array size
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 2. Populate the array with values
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 3. Read the number of queries
        int q = sc.nextInt();

        // 4. Process each query using a loop (Brute Force)
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            long rangeSum = 0;
            // Loop from left to right indices and manually aggregate
            for (int j = left; j <= right; j++) {
                rangeSum += arr[j];
            }

            System.out.println(rangeSum);
        }

        sc.close();
    }
}
