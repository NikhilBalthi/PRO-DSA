package HashingLec12;

import java.util.HashMap;
import java.util.Map;

public class OptimiseLec12_Q1 {

    public static int maxDistance(int[] arr) {
        // Map to store: Key = Element, Value = First occurrence index
        Map<Integer,Integer> map = new HashMap<>();
        int maxDist = 0;
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                // If it already exists, compute distance from the first occurrence
                int currDist = i - map.get(arr[i]);
                maxDist = Math.max(currDist,maxDist);
            }else {
                // If the map doesn't contain the element, record its first index
                map.put(arr[i],i);
            }
        }
        return maxDist;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        // '2' appears at index 1 and index 11 -> Distance = 11 - 1 = 10
        System.out.println("Optimized Output: " + maxDistance(arr)); // Output: 10
    }
}
