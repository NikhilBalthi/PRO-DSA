package HashingLec3;

//Count all the pairs (i,j) such that b[i]+b[j] = k (count of such pairs) [ i<j ]
// [ 3 , 2 , 1 , 2 , 5 ] , k = 4
public class BruteForceLec3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,2,5};
        int k = 4;
        int count = 0;
        for(int i = 0 ; i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    count++;
                }
            }
        }
        System.out.println("count is "+count);
    }
}
