package HashingLec12;

//Max distance between same elements
public class BruteForceLec12_Q1 {

    public static int maxDistance(int[] nums){
        int maxDistance = 0;
        // Compare every element with all elements after it
        for (int i = 0 ;i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                // If elements match, calculate the distance
                if(nums[i] == nums[j]){
                    int currentDistance = j - i;
                    maxDistance = Math.max(currentDistance,maxDistance);
                }
            }
        }
        return maxDistance;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        // Index of first '1' is 0, last '1' is 5 -> Distance = 5 - 0 = 5
        System.out.println("Brute-Force Output: " + maxDistance(arr)); // Output: 5
    }
    //Time Complexity: O(n^2) because of the nested loops.
    //Space Complexity: O(1) as no extra space is used.

}
