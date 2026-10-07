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
        // Count frequencies of characters in string s
        for(int i = 0 ;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // Decrease frequencies using string t
        for(int i = 0 ; i<t.length(); i++){
            char c = t.charAt(i);
            // If character isn't even in the map, it's not an anagram
            if(!map.containsKey(c)){
                System.out.println("Not An Anagram");
                return;
            }

            map.put(c,map.get(c)-1);
            // Optimization: Remove keys that hit 0
            if(map.get(c)==0){
                map.remove(c);
            }
        }
        // If map is completely empty, all counts matched perfectly
        if(map.isEmpty()){
            System.out.println("Valid Anagram");
        }else{
            System.out.println("Not an Anagram");
        }
    }
}
