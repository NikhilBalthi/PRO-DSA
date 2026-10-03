package HashingLec8;

//Find Largest or Smallest SubArray with sum k in given array
public class BruteForceLec8 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,3,-2,2};
        int k = 4;
        int maxLen = Integer.MIN_VALUE,minLen = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if(sum==k){
                    int len = j-i+1;
                    if(len<minLen){
                        minLen = len;
                    }
                    if(len>maxLen){
                        maxLen = len;
                    }
                }
            }
        }
        // Print the final outputs
        System.out.println("Min Length: " + (minLen == Integer.MAX_VALUE ? 0 : minLen));
        System.out.println("Max Length: " + (maxLen == Integer.MIN_VALUE ? 0 : maxLen));
    }
}
