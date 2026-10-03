package HashingLec4;

//Count all the pairs (i,j) such that b[i]-b[j] = k (count of such pairs) [ i<j ]
// [ 1 , 5 , 2 , 4 , 1 ] , k = 4
public class BruteForceLec4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,4,4,1,1};
        int k = 3;
        int count = 0;
        for (int i = 0 ; i< arr.length;i++){
            for (int j =i+1;j<arr.length;j++){
                // or if(arr[i] - arr[j] == k) count++
                if(arr[j]+k==arr[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
