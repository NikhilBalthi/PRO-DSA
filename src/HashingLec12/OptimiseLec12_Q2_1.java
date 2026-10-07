package HashingLec12;

public class OptimiseLec12_Q2_1 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println("Index: " + firstUniqChar(s)); // Output: 2
    }

    // TC : O(n)
    // SC : O(1)
    public static int firstUniqChar(String s) {

        // Frequency array for 26 lowercase English letters
        int[] freq = new int[26];
        int n = s.length();

        //Pass 1 : Count occurrances of each character
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        //Pass 2 : Find the first character with a frequency count of 1
        for (int i = 0; i<n ; i++){
            if(freq[s.charAt(i)-'a'] == 1){
                return i;
            }
        }

        return -1;
    }
}
