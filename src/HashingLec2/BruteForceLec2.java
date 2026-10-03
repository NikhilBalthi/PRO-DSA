package HashingLec2;

//Check if their any two equal numbers in an array at a distance less than or equal to k
//[3,2,3,3,1] k = 1

public class BruteForceLec2 {
    public static boolean hasCloseDuplicate(int[] arr, int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            // j <= i + k ensures we only look ahead up to k steps
            for (int j = i + 1; j < arr.length && j <= i + k; j++) {
                if (arr[i] == arr[j]) {
                    return true; // Stop immediately and return true
                }
            }
        }
        return false; // Loop completed without finding any pair
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 3, 1, 3, 4, 5, 6, 6, 0, 12, 13, 6};
        int k = 1;

        System.out.println(hasCloseDuplicate(arr, k));
    }
}

