package HashingLec2;

import java.util.HashMap;
import java.util.Map;

//Check if their any two equal numbers in an array at a distance less than or equal to k
//[3,2,3,3,1] k = 1
public class OptimiseLec2 {
    public static boolean containsCloseDuplicate(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            // If the element exists and the distance condition is met
            if (map.containsKey(arr[i]) && i - map.get(arr[i]) <= k) {
                return true;
            }
            // Always update to the latest index to minimize future distance checks
            map.put(arr[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 1, 3, 4, 5, 6, 3, 3};
        int k = 1;

        System.out.println(containsCloseDuplicate(arr, k));
    }
}