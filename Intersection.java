import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        int [] dataA = {1,2,3,4,5};
        int [] dataB = {3,4,5,6};
        System.out.println(inter(dataA, dataB));
    }

    public static String inter(int[]dataA,int[]dataB){
        StringBuilder intersection = new StringBuilder();
        List<Integer> dataSetA = Arrays.stream(dataA).boxed().toList();
        List<Integer> dataSetB = Arrays.stream(dataB).boxed().toList();
        dataSetA.stream().forEach(number -> {
            if (dataSetB.contains(number)) {
                intersection.append(number + " ");
            }
        });

        return intersection.toString();
    }
}
