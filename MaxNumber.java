
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(7,6,3,9,4,5);
        System.out.println("Max Value con for "+maxValue(lista));
        Integer max = Collections.max(lista);
        System.out.println ("Max Value con Collections max " + max);
        System.out.println("Max Value con Stream "+lista.stream().max(Integer::compareTo).get());
    }
    static int maxValue(List<Integer> array){
        int max = array.get(0);
        for (Integer num : array) {
            max = num > max ? num : max;
        }
        return max;
    }
}
