package HashingLec10;

import java.util.HashMap;
import java.util.Map;

public class OptimiseLec10_2 {
    public static void main(String[] args) {
        String s = "abcad";
        String t = "adbaa";

        if(s.length()!=t.length()){
            System.out.println("Not An Anagram");
            return;
        }

        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i = 0 ; i<t.length(); i++){
            char c = t.charAt(i);
            if(!map.containsKey(c)){
                System.out.println("Not An Anagram");
                return;
            }

            map.put(c,map.get(c)-1);

            if(map.get(c)==0){
                map.remove(c);
            }
        }

        if(map.isEmpty()){
            System.out.println("Valid Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
