package ejercicios;

public class FizzBuzz {
    public static void main(String... args) {
        System.out.println(FB(30));
        System.out.println(FB(32));
        System.out.println(FB(10));
        System.out.println(FB(12));
        System.out.println(FB(55));
        System.out.println(FB(60));
    }

    static String FB(int num) {
        // if(num % 15 == 0){
        // return "FizzBuzz";
        // }
        // if(num % 5 == 0){
        // return "Fizz";
        // }
        // if(num % 3 == 0){
        // return "Buzz";
        // }
        String cadenaReturn = num % 15 == 0
                ? "FizzBuzz"
                : num % 5 == 0
                        ? "Fizz"
                        : num % 3 == 0
                                ? "Buzz"
                                : "";
        return cadenaReturn;
    }
}
