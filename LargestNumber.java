import java.util.Arrays;

public class LargestNumber{
    public static void main(String ... args){
        int [] data = {12, 34, 54, 2, 93};
        System.out.println(largest(data));
    }

    public static int largest(int [] numbers){
        //FOR
       /*
         int maxNumber = 0;
       for(int number : numbers){
            maxNumber = (number > maxNumber) ? number : maxNumber;
        }
        return maxNumber;    */

        //stream
        return Arrays.stream(numbers).max().getAsInt();
       
    }
}