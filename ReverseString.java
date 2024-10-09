public class ReverseString {
    public static void main(String[] args) {
        System.out.println(anagram("12321"));
        System.out.println(anagram("TSST"));
        System.out.println(anagram("abcde"));
    }
    public static String reverse_mode_1(String cadena){
        char [] characters = cadena.toCharArray();
        String newCadena = "";
        for(int i = characters.length -1; i >= 0; i--){
           newCadena += characters[i];
        }
        return newCadena;
    }

    public static boolean anagram(String cadena){
        StringBuilder reverseCadena = new StringBuilder().append(cadena);
        return reverseCadena.reverse().toString().equals(cadena);
    }
}   
