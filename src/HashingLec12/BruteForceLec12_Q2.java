package HashingLec12;

//First Unique Character In A String
public class BruteForceLec12_Q2 {

    public static int firstUniqChar(String s){
        int n = s.length();

        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                // If same character is found at a different index, it's not unique
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    isUnique = false;
                    break;
                }
            }
            // If the inner loop finishes and the character is unique, return its index
            if(isUnique){
                return i;
            }
        }

        return -1; // No unique character found
    }
    //Time Complexity: O(n)
    //Space Complexity O(1)
    public static void main(String[] args) {
        String s = "loveleetcode";
        // 'l' repeats, 'o' repeats... 'v' at index 2 is the first unique character
        System.out.println("Index: " + firstUniqChar(s)); // Output: 2
    }
}
