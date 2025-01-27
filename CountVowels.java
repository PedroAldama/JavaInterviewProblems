import java.util.HashMap;

public class CountVowels {
    public static void main(String[] args) {
        String word = "Hello World";
        System.out.println(count(word));
        System.out.println(countV2(word));
        System.out.println(countV3(word));
    }

    public static String count(String cadena){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        int vowel;
        vowel = 0;
        String [] data = cadena.toLowerCase().split("");
        for(String letter: data ){
            if(vowelMap.contains(letter))
                vowel++;
        }
        return "The number of vowel is: " + vowel;
    }

    public static String countV2(String cadena){
        Set<Character> vowels = Set.of('a','e','i','o','u');
        long vowel = cadena.toLowerCase().chars().filter(c -> vowels.contains((char) c)).count();
        return "The number of vowel is: " + vowel;
    }
 
    public static String countV3(String cadena){
        long vowel = cadena.toLowerCase().chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
        return "The number of vowel is: " + vowel;
    }
}
