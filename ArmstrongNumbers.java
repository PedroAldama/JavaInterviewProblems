public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println(armstrong(123));
        System.out.println(armstrong(153));
        System.out.println(armstrong(370));
        System.out.println(armstrong(12));
        System.out.println(armstrong(371));
        System.out.println(armstrong(407));
    }

    public static boolean armstrong(int number){
        double sum = 0;
        int originalNumber = number;
        int pow = (number+"").length();
        while (number > 0) {
            sum += Math.pow(number%10, pow);
            number/=10;
        }
        return originalNumber == sum;
    }
}
