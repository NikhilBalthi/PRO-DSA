package HashingLec7;

public class OptimiseLec7_2 {
        public static void main(String[] args) {
            int[] arr = new int[]{1, 0, 1, 2, 10, 8};
            int k = 3, count = 0;

            // 1. Make the prefix array 1 size larger to handle index 0 perfectly
            int[] pref = new int[arr.length + 1];
            pref[0] = 0;

            for (int j = 0; j < arr.length; j++) {
                pref[j + 1] = pref[j] + arr[j];
            }

            // 2. Run your clean double loop
            for (int j = 1; j < pref.length; j++) {
                // Going backward from j-1 down to 0
                for (int i = j - 1; i >= 0; i--) {
                    // If the difference equals k, we found a valid subarray!
                    if (pref[j] - pref[i] == k) {
                        count++;
                    }
                }
            }

            System.out.println("Total subarrays: " + count);
        }
}
