
public class NumerosPrimos {
    public static void main(String ... args){
        System.out.println(esPrimo(27));
    }
    static boolean esPrimo(int numero){
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }
        int divisor = 5;
        while (divisor * divisor <= numero) {
            if (numero % divisor == 0 || numero % (divisor + 2) == 0) {
                return false;
            }
            divisor += 6;
        }
        return true;
    }
}
