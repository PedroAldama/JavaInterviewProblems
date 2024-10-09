
public class PalindromeV2 {
    public static void main(String [] args){
        int numero = 123;
        System.out.println(isPalindrome(numero));
    }
    public static boolean isPalindrome(int x) {
        if(x == 0 ) return true;
        if(x < 0 || x % 10 == 0) return false;

        int temp=x;
        int rev=0;
        int r;
        while(x>0){
            r=x%10;
            rev=(rev*10)+r;
            x=x/10;
        }
        return rev==temp;
        
    }
}
