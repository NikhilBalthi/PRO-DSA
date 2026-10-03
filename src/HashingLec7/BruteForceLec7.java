package HashingLec7;

//Count no of subarrays having sum = k
public class BruteForceLec7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,2,10,8};
        int k = 3,count=0;
        for (int j = 1 ; j <= arr.length;j++){
            int current_sum = 0;
            for(int i=j;i>=1;i--){
                current_sum+=arr[i];
                if(current_sum==k){
                    count++;
                }
            }
        }
    }
}
