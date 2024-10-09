package ejercicios;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CadenaInvertida {

    static String InvertStringManual(String cadena){
        String newCadena = "";
        for(int i =cadena.length() -1 ; i >=0;i--){
            newCadena+= cadena.charAt(i);
        }
        return newCadena;
    }
    
    static String InvertString(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }

    static HashMap<?,?> repetidos(String cadena){
        HashMap<Character,Integer> caracteresRepetidos = new HashMap<>();
        char [] caracteres = cadena.toCharArray();
        for (char c : caracteres) {
            if(caracteresRepetidos.containsKey(c)){
                caracteresRepetidos.put(c, caracteresRepetidos.get(c) + 1);
            } else {
                caracteresRepetidos.put(c, 1);
            }
        }
        return  caracteresRepetidos;
    }

    static boolean multiploDeX(int num, int baseMultiplo){
        return num % baseMultiplo == 0;
    }

    static String randomOrderString (String cadena){
        String newCadena = "";
        List<String> list = Arrays.asList(cadena.split(""));
        Collections.shuffle(list);

         for (String character : list) {
             newCadena += character;
         }
        return newCadena;
    }

    static Collection<?> GetOnlyNotDuplicateNumbers(Integer[] numbers){
        Set<Integer> notDuplicateNumbers = new HashSet<>();
         for (Integer number : numbers) {
             notDuplicateNumbers.add(number);
        }
        return  notDuplicateNumbers;
    }
   
    static boolean vowelIsPresent(String cadena){
        //return cadena.contains("a") || cadena.contains("e") || cadena.contains("i") || cadena.contains("o") || cadena.contains("u");
        return cadena.matches(".*[aeiou]*");
    }
   
    public static void main(String[] args) {
        //CadenaInvertida app = new CadenaInvertida();
        System.out.println(vowelIsPresent("moticode"));
        //System.out.println(multiploDeX(9,3));
        //System.out.println(randomOrderString("moticode"));
        // Integer [] lista = {1,2,3,4,1};
        // System.out.println(GetOnlyNotDuplicateNumbers(lista));
    }
}
