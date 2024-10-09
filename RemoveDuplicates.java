import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String ... args){
        int [] data = {1, 2, 2, 3, 4, 4, 5};
        int [] newData = unique(data);
        for(int number: newData){
            System.out.print(number + " ");
        }
    }

    public static int [] unique(int [] numbers){
       
        //List<Integer> lista = Arrays.stream(numbers).boxed().toList();
        //List<Integer> lista = Arrays.stream(numbers).boxed.collect(Collectors.toList());
        
        return Arrays.stream(numbers)
        .boxed()
        .toList()
        .stream()
        .distinct()
        .mapToInt(i->i).toArray();
    }
}
