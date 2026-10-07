package HashingLec11;

//Find Frequency Of Element In The Array
public class BruteForceLec11_Q1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 1, 1};
        int x1 = 1;
        int result1 = findFrequency(arr1, x1);

        System.out.println("Example 1 Output: " + result1);
        // Expected Output: 5

        // --- Test Example 2 ---
        int[] arr2 = {1, 2, 3, 3, 2, 1};
        int x2 = 2;
        int result2 = findFrequency(arr2, x2);

        System.out.println("Example 2 Output: " + result2);
        // Expected Output: 2
    }

    private static int findFrequency(int[] nums, int target) {
        int count = 0;
        for(int num : nums){
            if(num == target){
                count++;
            }
        }
        return count;
    }
}
