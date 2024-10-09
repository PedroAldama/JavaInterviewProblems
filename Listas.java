
import java.util.*;

public class Listas {
    public static void main(String ... args){
        List<Integer> lista =  Arrays.asList(100,200,300);
        
        lista.stream().reduce((acumulador,numero) -> acumulador + numero).ifPresent(System.out::println);;
        


       List<Integer> gastos= new ArrayList<Integer>();
       gastos.add(100);
       gastos.add(200);
       gastos.add(300);
     
       gastos.stream().reduce((acumulador,numero)-> {
         return acumulador+numero;
       }).ifPresent(System.out::println);

       reduceString();
       
    }

    static void reduceString(){

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters.stream().reduce("", String::concat);
      System.out.println(result);
    }
}
