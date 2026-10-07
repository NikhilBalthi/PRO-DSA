package HashingLec11;

import java.util.Scanner;

public class OptimiseLec11_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(!sc.hasNext()) return;

        int n = sc.nextInt();

        int[] arr = new int[n];

        long[] pref = new long[n+1];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
            pref[i+1] = pref[i] + arr[i];
        }

        //Read no of queries
        int q = sc.nextInt();

        // Process each query in O(1) time
        for (int i = 0; i < q; i++) {
            int left = sc.nextInt();
            int right = sc.nextInt();

            long rangeSum = pref[right+1] - pref[left];
            System.out.println(rangeSum);
        }

        sc.close();
    }
    /** Enter in terminal
    no of elements : 3
     enter elements : 1 4 1
     q : 3
     query : 1 1
     4
    query : 1 2
     5
     query : 0 2
     6
     */
}
