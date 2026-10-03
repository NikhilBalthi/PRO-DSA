package HashingLec7;

//Count No of subrrays having sum = k , arr[i]+arr[j]=k
public class OptimiseLec7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,1,2,10,8};
        int k = 3, count=0;
        int[] pref = new int[arr.length];
        for(int j = 1 ; j<arr.length; j++){
            pref[j] = pref[j-1]+arr[j];
        }
        for(int j = 1;j<arr.length;j++){
            for (int i=0;i<j;i++){
                if(pref[i] == pref[j]-k){
                    count++;
                }
            }
        }

        System.out.println("count is "+count);
    }
}
