public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5,6};
        System.out.println(find(data,4));
        
    }

    public static String find(int [] list, int number){

        int inicio = 0;
        int fin = list.length - 1;
        int medio;
        while(inicio <= fin){
             medio = inicio + (fin - inicio) / 2;

             if(list[medio] == number){
                return "Index encontrado = " + medio;
             }
             if(list[medio] < number){
                inicio = medio + 1;
             } else{
                fin = medio -1;
             }
        }

        return "Not Found";
    }
}
