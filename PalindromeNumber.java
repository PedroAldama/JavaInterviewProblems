public class PalindromeNumber{
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));//true
        System.out.println(isPalindrome(123));//false
        System.out.println(isPalindrome(12221));//true
        System.out.println(isPalindrome(123312));//false
    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int result = 0;
        
        while(number > 0){
            result = result * 10 + (number % 10);
            number/=10;
        }

        return originalNumber == result;
    }
}