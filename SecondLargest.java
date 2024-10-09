public class SecondLargest {
    public static void main(String[] args) {
        int [] largest = {10,5,20,15};
        System.out.println(findSecond(largest));
    }

    public static int findSecond(int [] data){
        int max,second;
        max = second = 0;
        for(int num : data){
            if(num > max){
                second = max;
                max = num;
            } else {
                second = num > second ? num : second;
            }


        }
        return second;
    }
}
