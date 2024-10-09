public class Binary {
    public static void main(String[] args) {
        System.out.println(binaryConvert(10));
    }

    public static String binaryConvert(int num){
        
        StringBuilder binary = new StringBuilder().append("");
        while (num > 0) {
            binary.append(num%2 ==0 ? "0" : "1");
            num/=2;
        }
       
        return binary.reverse().toString();
    }
}
