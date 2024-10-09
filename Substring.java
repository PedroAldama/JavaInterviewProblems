import java.util.HashMap;

public class Substring {
    public static void main(String[] args) {
        System.out.println(sub("abcnkabcdbb"));        
    }

    public static String sub(String cadena){
        StringBuilder newCadena = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        HashMap<String,Integer> map = new HashMap<>();
        String [] characters = cadena.split("");
        for(String c : characters){
            if(map.containsKey(c)){
                if(temp.length() > newCadena.length()){
                    newCadena.setLength(0);
                    newCadena.append(temp);  
                }
                temp.setLength(0);
                map.clear();
            }
            temp.append(c);
            map.put(c, 1);

        }
        return newCadena.toString();
    }
}
