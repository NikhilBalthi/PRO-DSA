package HashingLec2;

import java.util.HashSet;
import java.util.Set;
//Check if their any two equal numbers in an array at a distance less than or equal to k
//[3,2,3,3,1] k = 1
public class UsingSetLec2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 1, 3, 4, 5, 6, 3, 3};
        int k = 1;

        System.out.println(containsCloseDuplicateSlidingWindow(arr, k));
    }
    public static boolean containsCloseDuplicateSlidingWindow(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // If the window size exceeds k, remove the oldest element
            if (i > k) {
                set.remove(arr[i - k - 1]);
            }
            // If we can't add it, it means a duplicate already exists in the current window
            if (!set.add(arr[i])) {
                return true;
            }
        }
        return false;
    }
}
