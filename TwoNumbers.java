
import java.util.ArrayList;
import java.util.List;

public class TwoNumbers {
    public static void main(String [] args){
        int [] l1 = {2,4,3};
        int [] l2 = {5,6,3};
        List <Integer> resultado = Numeros(l1,l2);
        System.out.println(resultado);
    }
    public static List<Integer> Numeros(int [] l1, int [] l2){
        int listaMenor = l1.length > l2.length ? l2.length : l1.length;
        String listaMayor = l1.length > l2.length ? "l1" : "l2";
        int res,i,residuo = 0;
        List<Integer> lista = new ArrayList<>();

        for(i = 0; i< listaMenor; i++){
             res = l1[l1.length - 1 - i] + l2[l2.length - 1 - i] + residuo;
            residuo = res >= 10 ? 1 : 0;
            if(res < 10){
                lista.add(res);
            } else {
                lista.add(res - 10);
            }
        }
        if(listaMayor.equals("l1")){
            for(int j = i;j < l1.length; j++ ){
                res = l1[l1.length - 1 - j] + residuo;
                residuo = res >= 10 ? 1 : 0;
                if(res < 10){
                    lista.add(res);
                } else {
                    lista.add(res - 10);
                }
            }
        } else {
            for(int j = i;j < l2.length; j++ ){
                res = l2[l2.length - 1 - j] + residuo;
                residuo = res >= 10 ? 1 : 0;
                if(res < 10){
                    lista.add(res);
                } else {
                    lista.add(res - 10);
                }
            }
        }
        if (residuo > 0) {
            lista.add(1);
        }
        return lista;
    }
}
