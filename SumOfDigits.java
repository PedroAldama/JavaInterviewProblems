import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum_reduce("123"));
        System.out.println(sum_reduce("541"));
        System.out.println(sum_reduce("123"));
    }   
    
    public static int sum(String cadena){
        String [] numeros = cadena.split("");
        int sum = 0;
        for(String num : numeros){
                sum+=Integer.parseInt(num);
        }
        return sum;
    }

    public static int sum_reduce(String cadena){
        List<String> lista = new ArrayList<>(Arrays.asList(cadena.split("")));
        return lista.stream()
        .map(num-> Integer.parseInt(num))
        .reduce((acc,num) -> acc + num)
        .get();
    }
}
