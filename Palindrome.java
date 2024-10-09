
public class Palindrome {
    public static void main(String [] args){
        int numero = 11211;
        System.out.println(palindrome(numero));
    }
    public static Boolean palindrome(int numero){
        if(numero == 0)  return true;
        if(numero < 0) return false;
        if(numero % 10 == 0) return false;
        
        String nuevoNumero = Integer.toString(numero);
        char [] caracteres = nuevoNumero.toCharArray();
        for(int i = 0; i < caracteres.length / 2; i++){
            if (!(caracteres[i] == caracteres[caracteres.length - 1 -i])) {
                return false;
            } 
        }
        return true;
    }
}
