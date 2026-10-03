package HashingLec4;

import java.util.HashMap;
import java.util.Map;

//Count all the pairs (i,j) such that b[i]-b[j] = k (count of such pairs) [ i<j ]
// [ 1 , 5 , 2 , 4 , 1 ] , k = 4
public class OptimiseLec4 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,4,4,1,1};
        int k = 3;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0 ;i<arr.length;i++){
            if(map.containsKey(arr[i]+k)){
                count+=map.get(arr[i]+k);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(count);
    }
}
