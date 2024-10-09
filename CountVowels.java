import java.util.HashMap;

public class CountVowels {
    static final HashMap<String,Integer> vowelMap = new HashMap<>();
    static{
        vowelMap.put("a", 1);
        vowelMap.put("e", 1);
        vowelMap.put("i", 1);
        vowelMap.put("o", 1);
        vowelMap.put("u", 1);
    }
    
    public static void main(String[] args) {
        System.out.println(count("Hello World!"));
    }

    public static String count(String cadena){
        int vowel, consonants;
        vowel = consonants = 0;
        String [] data = cadena.toLowerCase().split("");
        for(String letter: data ){
            if(vowelMap.containsKey(letter)){
                vowel++;
                continue;
            }
            if(!letter.equals(" ")){
                consonants++;
            }
        }
        return "The number of vowel is: " + vowel + " and consonants: " + consonants;
    }
}
