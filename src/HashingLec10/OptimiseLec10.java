package HashingLec10;

public class OptimiseLec10 {
    public static void main(String[] args) {
        String s = "abcad";
        String t = "adbaa";

        if(s.length()!=t.length()){
            System.out.println("Not An Anagram");
            return;
        }

        int[] freq = new int[26];
        for(int i = 0; i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }

        boolean isAnagram = true;
        for(int count : freq){
            if(count!=0){
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Valid Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
