
import java.util.HashMap;

public class EncontrarCaracter {
    public static void main(String ... args){
        String cadena = "abcdabcd";
        System.out.println(found(cadena));
    }


    public static String found(String cadena){
        String [] arreglo = cadena.split("");
        HashMap<String,Integer> mapa = new HashMap<>();
        for(String data: arreglo){
            if(!mapa.containsKey(data)){
                mapa.put(data, 1);
            } else {
                mapa.put(data, mapa.get(data) + 1);
            }
        }

        for(int i = 0; i < cadena.length(); i++){
            if(mapa.get(arreglo[i]) == 1){
                return arreglo[i];
            }
        }
        return "_";
    }
}
