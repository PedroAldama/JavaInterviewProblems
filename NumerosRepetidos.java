
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NumerosRepetidos {
    public static void main(String ... args){
        int [] lista = {1,2,3,3,3,2,4,5,5,6,7,1,3};
        System.out.println(repetidos(lista));
    }
    static Set<Integer> repetidos(int[] nums){
        
        HashMap<Integer, Integer> numeros = new HashMap<>();
        Set<Integer> duplicados = new HashSet<>();
        for (int i : nums) {
            if(numeros.containsKey(i)){
                duplicados.add(i);
            } else {
                numeros.put(i,1);
            }
        }
    return duplicados;
    }
}
