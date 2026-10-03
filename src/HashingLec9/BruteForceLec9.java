package HashingLec9;

//Find count of Shortest / largest sub arrays with sum k in given array
//Shortest Subarray	Lnegth is 2	i.e [1, 2] and [2, 1], totalCount is 2
//Largest Subarray	Length is 3	i.e [2, -1, 2]	totalCount is 1
public class BruteForceLec9 {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = new int[]{1,2,-1,2,1};
        System.out.println("nof sub arrays with largest size "+ countLargestSubarrayWithSumK(nums,k));
        System.out.println("no of sub arrays with smallest size "+countShortestSubarrayWithSum(nums,k));
    }

    public static int countShortestSubarrayWithSum(int[] nums,int k){
        int n = nums.length;
        int minLength = Integer.MAX_VALUE,count = 0;
        for(int start = 0; start<n; start++){
            int sum = 0;
            for(int end = start; end<n; end++){
                sum+=nums[end];
                if(sum==k){
                    int length = end-start+1;
                    if(length<minLength){
                        minLength = length;
                        count = 1;
                    }else if(length == minLength){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int countLargestSubarrayWithSumK(int[] nums,int k){
        int n = nums.length;
        int maxLength = Integer.MIN_VALUE,count = 0;
        for (int start = 0 ; start < n; start ++) {
            int sum = 0;
            for(int end = start; end<n ; end++){
                sum+=nums[end];
                if(sum==k){
                    int length = end-start+1;
                    if(length > maxLength){
                        maxLength = length;
                        count=1;
                    }else if(length == maxLength){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
