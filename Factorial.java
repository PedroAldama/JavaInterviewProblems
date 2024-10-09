public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(6));
        System.out.println(fact(0));
    }

    public static int fact(int number){
        int factorial = 1;
        for(int i = number; i > 0; i--){
            factorial*=i;
        }
        return factorial;
    }
}
