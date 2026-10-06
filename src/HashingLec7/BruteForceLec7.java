package HashingLec7;

// Count no of subarrays having sum = k
public class BruteForceLec7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 2, 10, 8};
        int k = 3, count = 0;

        // j represents the ending index of our subarray
        for (int j = 0; j < arr.length; j++) {
            int current_sum = 0;

            // i moves backwards from j to the start of the array (index 0)
            for (int i = j; i >= 0; i--) {
                current_sum += arr[i];
                if (current_sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Total subarrays: " + count);
        // For this array, the output will be 3: [1, 0, 1, 1], [0, 1, 2], and [1, 2]
    }
}