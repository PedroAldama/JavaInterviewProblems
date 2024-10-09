public class SortArray {
    public static void main(String[] args) {
        int [] data = {6,5,8,7,2,3,9,1};
        int [] newData = order(data);
        for(int number: newData){
            System.out.print(number + " ");
        }
    }
    
    public static int [] order(int[] numbers){

        int k = 0;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    k = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = k;
                }
            }
        }
        return numbers;
    }
}
