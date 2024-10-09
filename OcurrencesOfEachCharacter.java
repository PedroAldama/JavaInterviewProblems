import java.util.Arrays;
import java.util.HashMap;

public class OcurrencesOfEachCharacter {

    static final HashMap<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        String cadena = "programming";
        ocurrences(cadena);
        map.forEach((key,value) -> System.out.println(key + " = " + value));
    }

    public static void ocurrences(String cadena){
        Arrays.asList(cadena.split(""))
        .stream()
        .forEach(letter->map.put(letter, map.containsKey(letter) ? map.get(letter) + 1 : 1));
    }
}
