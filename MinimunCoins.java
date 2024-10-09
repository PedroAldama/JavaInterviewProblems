import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class MinimunCoins{
    public static void main(String[] args) {
        minimun(1458);
    }
 
    public static void minimun(int money){
        int [] coinsValue = {500,200,100,50,20,10,5,1};
        HashMap<Integer, Integer> minimunCoins = new HashMap<>();
        int i = 0;
        int currentCoin;
        while(money > 0){
            currentCoin = money/coinsValue[i];
            minimunCoins.put(coinsValue[i], currentCoin);
            money%=coinsValue[i];
            i++;
        }
        show(minimunCoins);
    }

    public static void show(HashMap<Integer,Integer> data){
        TreeMap<Integer,Integer> orderMap = new TreeMap<>(Comparator.reverseOrder());
        orderMap.putAll(data);
        orderMap.forEach((key,value)->{
            if(value > 0){
                System.out.println("Coin Value: " + key + " value: " + value);
            }
        });
    }
}