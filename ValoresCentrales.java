
public class ValoresCentrales {
    public static void main(String[] args) {
        System.out.println(values(1, 10));
        System.out.println(values(3, 5));
    }

    public static String values(int x, int y){
        float valor = (x+y)/2;
        String result = (y - x - 1) % 2 == 0 ?  valor + " y " + (valor + 1) : valor+"" ;
        return "El o los valores centrales entre " + x + " y " + y + " es/son: " + result;
    }
}
