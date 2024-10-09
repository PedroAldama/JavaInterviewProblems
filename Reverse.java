
public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("cadena"));
    }
    static String reverse(String cadena){
        return new StringBuilder(cadena).reverse().toString();
    }
}
