package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindNumbrer {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        List<Integer> lista = found(nums, 9);

        boolean value = !lista.isEmpty();
        System.out.println(value);
        if(value){
            lista.stream().forEach(System.out::println);;
        }
    }


    static  List<Integer> found(int [] num, int numToFind){
        HashMap<Integer,Integer> numeros = new HashMap<>();
        List<Integer> lista = new ArrayList<>();
        for(int i=0; i < num.length; i++){
            if (!numeros.isEmpty() && numeros.containsValue(numToFind - num[i])) {
                    lista.add(numeros.get(numToFind - num[i]));
                    lista.add(num[i]);
                    return lista; 
            } else {
                numeros.put(num[i],num[i]);
            }
        }
        return lista;
    }
}
