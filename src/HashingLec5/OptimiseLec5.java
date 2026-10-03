package HashingLec5;

import java.util.HashMap;
import java.util.Map;

//Count all the pairs (i,j) such that abs(b[i]-b[j]) = k (count of such pairs) [ i<j ]
// [ 1 , 5 , 3 , 4 , 2 ] , k = 4
public class OptimiseLec5 {
    public static void main(String[] args) {
        //here abs is there so 1-3 can become 2 or 5-3 becomes 2
        int[] arr = new int[]{1,5,3,4,2,2};
        int k = 2;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i<arr.length;i++){
            //check both for arr[i]+k or arr[i]-k
            if(map.containsKey(arr[i]+k)){
                count+=map.get(arr[i]+k);
            }
            if(map.containsKey(arr[i]-k)){
                count+=map.get(arr[i]-k);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);
    }
}
