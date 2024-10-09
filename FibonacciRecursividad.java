package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class FibonacciRecursividad {
    public static void main(String[] args) {
        System.out.println(fibonacciString(10));
    }
    static int fibonacci(int num){
        if(num==0) return 0;
        if(num==1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    static String fibonacciString(int num){
        if(num == 0) return "0";
        if(num == 1) return "1";
        
        List<Integer> serie = new ArrayList<>();
        serie.add(1);
        serie.add(1);
        for(int i=2; i<num;i++){
            serie.add(serie.get(i-2) + serie.get(i-1));
        }
        return serie.toString();
    }
}
