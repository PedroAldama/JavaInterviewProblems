//import java.util.Arrays;
package ejercicios;

public class Hello{
    public static void main(String[] args){
        Double [] x = new Double[4];
        x[0] = (double) suma(1,2);
        x[1] = (double) resta(1,2);
        x[2] = (double) multiplicacion(1, 2);
        x[3] = (double) division(2, 0);

        found(x);
    }
    public static void found(Double ...nums){
      for(Double n:nums){
        System.out.println(n);
      }
    }

    public static int suma(int x, int y){
      return x + y;
    }
    public static int resta(int x, int y){
      return x - y;
    }
    public static int multiplicacion(int x, int y){
      return x * y;
    }
    public static Double division(int x, int y){
      Double res = 0d;
      try {
        res = (double) (x / y);
      } catch (Exception e) {
        System.out.println("Error al dividir " + e);
      }
      return res;
    }
}