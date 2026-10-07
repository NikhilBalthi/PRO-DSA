package HashingLec10;

import java.util.Arrays;

// Valid Anagram or Not ?
public class BruteForceLec10 {
    public static void main(String[] args) {
        String s = "abcad";
        String t = "adbaa";

        if(s.length()!=t.length()){
            System.out.println("Not an anagram");
            return;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(Arrays.equals(sArr,tArr)){
            System.out.println("Valid Anagram");
        }else{
            System.out.println("Not An Anagram");
        }
    }
}
