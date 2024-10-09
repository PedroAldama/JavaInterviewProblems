public class FindNumber {
    public static void main(String[] args) {
        int [] data = {1, 2, 3, 6, 7};
        
        System.out.println(number(data));
    }
    public static int number(int[]data){
        int value = data[0];
        for(int i = 0; i< data.length;i++){
            if(value != data[i]){
                return value;
            }
            value++;
        }
        return 0;
    }
}
