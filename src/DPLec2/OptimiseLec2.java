package DPLec2;

public class OptimiseLec2 {
    public static void main(String[] args) {

        int[] arr = new int[]{6,7,3,2,2};
        int n = arr.length;

        // Create a prefix sum (DP) array to store cumulative totals.
        // In Java, new int[] arrays are automatically initialized with 0s.
        int[] dp = new int[n+1];

        int i = 0;
        // Loop through the input array to build the prefix sums
        while(i<=n-1){
            if(i==0){
                // The first element's cumulative sum is just the element itself
                dp[i] = arr[i];
            }else{
                // Current prefix sum = current element + sum of all previous elements
                dp[i] = arr[i] + dp[i-1];
            }
            i++; // Move to the next index
        }
        // Define the total number of lookup queries
        int q = 4;
        // The query array containing the indices we want to look up
        int[] w = {0,3,4,2};
        i = 0;
        // Loop through and process each individual query
        while(i<=q-1){
            // Extract the specific index requested by the current query
            int query = w[i];
            // Print out the precalculated prefix sum for the requested index.
            // Because the data is precalculated, this lookup takes O(1) time.
            System.out.println(dp[query]);
            i++; // Move to the next query
        }
    }
}
