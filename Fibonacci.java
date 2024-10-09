public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fiboSerie(10));
    }

    public static String fiboSerie(int number){

        if(number <= 1){
            return "0";
        }
        if(number == 2){
            return " 0 1";
        }
        int currentNumber, leftNumber = 0;
        int rightNumber = 1;
        StringBuilder returnString = new StringBuilder().append("0 1");
        for(int i = 2; i < number; i++){
            currentNumber = leftNumber + rightNumber;
            leftNumber = rightNumber;
            rightNumber = currentNumber;
            returnString.append(" " + currentNumber);
        }
        return returnString.toString();
    }
}
