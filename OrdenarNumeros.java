
import java.util.Arrays;
import java.util.List;

public class OrdenarNumeros {
    public static void main(String ... args){
        System.out.println(ordenar(41325));
    }
    static String ordenar(int num){
        String[] nums = (num + "").split("");
        List<String> numerosOrdenaos = Arrays.asList(nums);
        numerosOrdenaos.sort((a,b) -> a.compareTo(b));
        return numerosOrdenaos.toString();
    }
}
