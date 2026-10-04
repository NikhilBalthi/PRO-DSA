package DPLec3;
//Find Max Non Adjacent SubSet Sum
public class OptimiseLec3 {
    public static void main(String[] args) {
        int[] a = {6, 7, 3, 2, 2};
        int n  = a.length;

        System.out.println("max non adjacent subset sum "+maxSumNonAdjacent(a,n));
    }

    public static int maxSumNonAdjacent(int[] a, int n) {
        //Base case
        if(n==0) return 0;
        if(n==1) return Math.max(0,a[0]);
        // DP array to store the maximum sum possible up to index i
        int[] dp = new int[n];

        dp[0] = Math.max(0,a[0]);

        dp[1] = Math.max(dp[0],a[1]);
        // Build the DP table
        for(int i = 2; i<n;i++){

            // Choice 1: Include current element 'a[i]' + max sum from 2 steps back 'dp[i-2]'
            int include = a[i]+dp[i-2];

            // Choice 2: Exclude current element, carry forward max sum from 1 step back 'dp[i-1]'
            int exlude = dp[i-1];

            // Take the best of both choices
            dp[i] = Math.max(include,exlude);
        }
        // The final element contains the answer for the whole array
        return dp[n-1];
    }
}
