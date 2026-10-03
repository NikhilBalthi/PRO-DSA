package HashingLec3;
import java.util.HashMap;
import java.util.Map;
//Count all the pairs (i,j) such that b[i]+b[j] = k (count of such pairs) [ i<j ]
// [ 3 , 2 , 1 , 2 , 5 ] , k = 4
public class OptimiseLec3 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 1, 2, 5};
        int k = 4;
        int count = 0;
        // Map to store the frequency of numbers we have seen so far
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            int remaining = k - arr[j];
            // If the complement exists in the map, add its frequency to our count
            if (map.containsKey(remaining)) {
                count += map.get(remaining);
            }
            // Update the frequency of the current element in the map
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
        }
        System.out.println("count is " + count);
    }
}