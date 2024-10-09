
import java.util.Arrays;
import java.util.HashMap;

public class Sum {
    public static void main(String [] args){
        int [] nums = {3,3,6,2};
        int [] index = encontrar(nums,5);
        System.out.println(Arrays.toString(index));
    }

        public static int[] encontrar(int[]nums,int target){
        HashMap <Integer,Integer> data = new HashMap<>();
        Integer i = 0;

        int res = 0;
        for(int num:nums){
            res = target - num;
            if(data.containsKey(res)){
                return new int [] {data.get(res),i};
            }
            data.put(num,i);
            i++;
        }
        return new int [] {-1,-1};
    }
}
