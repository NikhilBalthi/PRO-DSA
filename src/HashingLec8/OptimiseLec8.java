package HashingLec8;

//Find Largest or Smallest SubArray with sum k in given array
import java.util.HashMap;
import java.util.Map;

public class OptimiseLec8 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,-2,2};
        int k = 4;
        int maxLen = Integer.MIN_VALUE,minLen = Integer.MAX_VALUE;
        Map<Integer,Integer> maxMap = new HashMap<>();
        Map<Integer,Integer> minMap = new HashMap<>();
        int currentSum = 0;
        maxMap.put(0,-1);
        minMap.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            if(maxMap.containsKey(currentSum-k)){
                int len = i - maxMap.get(currentSum-k);
                maxLen = Math.max(maxLen,len);
            }
            // Only put it once, keep the leftmost index
            //If you see a currentSum that you have already seen before, you do not overwrite it.
            // You keep the very first index where it appeared.
            if(!maxMap.containsKey(currentSum)){
                maxMap.put(currentSum,i);
            }
            if(minMap.containsKey(currentSum-k)){
                int len = i - minMap.get(currentSum-k);
                minLen = Math.min(minLen,len);
            }
            // Always overwrite, keep the rightmost index
            minMap.put(currentSum,i);
        }
        System.out.println("Min Length: " + (minLen == Integer.MAX_VALUE ? 0 : minLen));
        System.out.println("Max Length: " + (maxLen == Integer.MIN_VALUE ? 0 : maxLen));
    }
}

