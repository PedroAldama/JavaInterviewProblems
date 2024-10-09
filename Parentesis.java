
import java.util.*;

public class Parentesis {
    public static void main(String[] args) {
        System.out.println(checklista("([{}])"));//true
        System.out.println(checklista(")}"));//false
        System.out.println(checklista(""));//true
        System.out.println(checklista("({}){}[]"));//true
        System.out.println(checklista("({}{}[]"));//false
        System.out.println(checklista(")("));//false
        System.out.println(checklista("()}"));//false
        System.out.println(checklista("(((((({[]}))))))"));//true
    }

    static boolean checklista(String lista){

        if(lista.length() == 0 ) return true;
        if(lista.length() % 2 != 0 ) return false;

        List<String> cadena = new ArrayList<>(Arrays.asList(lista.split("")));
        HashMap<String,String> orden = new HashMap<>();
        orden.put("(", ")");
        orden.put("[", "]");
        orden.put("{", "}");

        int length = -1;

        List<String> abrir =  new ArrayList<>();
        boolean cerrar =  false;

        for(String data: cadena){

            if(!orden.containsKey(data) && !orden.containsValue(data)) return false;

            if(orden.containsKey(data)){
                abrir.add(data);
                length++;
                cerrar = false;
            } else if(length >= 0){
                if(data.equals(orden.get(abrir.get(length)))){
                    abrir.remove(length);
                    length--;
                    cerrar = true;
                }else{
                    return false;
                }
            }
        }

        return abrir.size() == 0 && cerrar ;
    }
}
