import java.util.HashMap;

public class SumOfTwoNumbers {
    public static void main(String ... args){
        int [] data = {2, 7, 11, 15};
        System.out.println(twoNumbers(data, 18));
        System.out.println(twoNumbers(data, 17));
        System.out.println(twoNumbers(data, 23));
    }

    public static String twoNumbers(int[] nums, int value){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            if(map.containsKey(value - num)){
                return map.get(value - num) + " " + num;
            }
            map.put(num, num);
        }
        return "Numbers not found";
    }
}
