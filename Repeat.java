
import java.util.HashMap;

public class Repeat {
    public static void main(String [] args){
        String cadena =  "aab";
        check(cadena);
    }

    public static void check(String s){
     HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        int right = 0; int left = 0; int max_len = 0;
        while(right < n){
            char cur = s.charAt(right);
            if(map.containsKey(cur)){
                left = Math.max(left, map.get(cur) + 1);
            }
            map.put(cur, right);
            max_len = Math.max(right - left + 1, max_len);
            right++;
            
        }
        System.out.println(max_len);
    }
}
