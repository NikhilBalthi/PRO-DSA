package HashingLec5;
//Count all the pairs (i,j) such that abs(b[i]-b[j]) = k (count of such pairs) [ i<j ]
// [ 1 , 5 , 3 , 4 , 2 ] , k = 4
public class BruteForceLec5 {
    public static void main(String[] args) {
        //here abs is there so 1-3 can become 2 or 5-3 becomes 2
        int[] arr = new int[]{1,5,3,4,2};
        int k = 2;
        int count = 0;
        for (int i = 0 ;i<arr.length;i++){
            for (int j =i+1 ;j<arr.length;j++){
                int res = Math.abs(arr[i]-arr[j]);
                if(res==k){
                    System.out.println(arr[i] + " " +arr[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
