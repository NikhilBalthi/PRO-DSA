package HashingLec9;

import java.util.HashMap;
import java.util.Map;


public class OptimiseLec9 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] nums = new int[]{1,2,-1,2,1};
        int k = 3;
        System.out.println("no of subrrays with largest size "+countLargestSubarrayWithSumK(nums,k));
        System.out.println("no of subarrays with smallest size "+countSmallestSubarrayWithSumK(nums,k));
    }

    public static int countLargestSubarrayWithSumK(int[] nums,int k){


        return 0;
    }
    public static int countSmallestSubarrayWithSumK(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int n = nums.length;
        int prefixSum = 0;
        int minLength = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-k)) {
                int length = i - map.get(prefixSum - k);
                minLength = Math.min(minLength,length);
            }
            map.put(prefixSum,i);
        }
        if(minLength == Integer.MIN_VALUE) return 0;

        int count = 0;
        map.clear();
        map.put(0,-1);
        for (int i = 0; i < n; i++) {
            prefixSum+=nums[i];

        }
        return 0;
        //incomplete code
    }
}
