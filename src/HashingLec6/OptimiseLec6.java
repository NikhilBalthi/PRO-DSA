package HashingLec6;

public class OptimiseLec6 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,4,1,2,1,4};
        //creating prefixSum at start itself saves time
        int[] pref = createPrefixSum(arr);

        int[][] queries = {
                {2,5},{0,3},{1,4}
        };

        for (int i = 0 ; i<queries.length; i++){
            int l = queries[i][0];
            int r = queries[i][1];
            int totalSum = getSum(l,r,pref);
            System.out.println("sum range" + l + "" +r +"" +totalSum);
        }
    }

    private static int[] createPrefixSum(int[] arr) {
        int[] pref = new int[arr.length];
        for(int i = 1; i<arr.length; i++){
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }

    public static int getSum(int l, int r , int[] pref){
        if(l==0) return pref[0];
        else return pref[r]-pref[l-1];
    }

}
