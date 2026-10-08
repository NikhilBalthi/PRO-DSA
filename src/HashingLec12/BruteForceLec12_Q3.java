package HashingLec12;

import java.util.ArrayList;
import java.util.List;

public class BruteForceLec12_Q3 {

    public static List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        String word = words[0];
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            boolean isCommon = true;
            for (int j = 1; j < words.length; j++) {
                int index = words[j].indexOf(ch);
                if(index != -1){
                    words[j] = words[j].substring(0,index) + words[j].substring(index+1);
                }else{
                    isCommon = false;
                    break;
                }
            }
            if(isCommon){
                result.add(String.valueOf(ch));
            }
        }
        return result;
    }
    // Main method to run and test the code
    public static void main(String[] args) {
        // Test Case 1: Standard input with duplicates
        String[] test1 = {"bella", "label", "roller"};
        List<String> output1 = commonChars(test1);
        System.out.println("Test Case 1 Output: " + output1);
        // Expected output: [e, l, l]

        // Test Case 2: Another standard input
        String[] test2 = {"cool", "lock", "cook"};
        List<String> output2 = commonChars(test2);
        System.out.println("Test Case 2 Output: " + output2);
        // Expected output: [c, o]
    }
}
