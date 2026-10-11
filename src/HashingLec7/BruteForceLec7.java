package HashingLec7;

public class BruteForceLec7 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1, 2, 10, 8};
        int k = 3;
        int count = 0;

        // Outer loop 'i' sets the START of the subarray
        for (int i = 0; i < arr.length; i++) {
            int current_sum = 0;

            // Inner loop 'j' expands the END of the subarray forward
            for (int j = i; j < arr.length; j++) {
                current_sum += arr[j]; // Keep adding elements as the window grows

                // Check if the current window matches our target k
                if (current_sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Total subarrays: " + count); // Output: 2
    }
}
