
import java.util.Arrays;
import java.util.Scanner;

public class Reservas {
    private static char [] [] reservas = new char [10] [10];
    private static Scanner in = new Scanner(System.in);
   
    static void showAll(){
        for(int i=0;i<reservas.length;i++){
            for(int j =0; j<reservas[1].length;j++){
                System.out.print(String.format("[%c]", reservas[i][j]));
            }
            System.out.println("");
        }
    }

    static void fillData(){
        for(int i = 0; i < 10 ;i++){
            Arrays.fill(reservas[i], 'L');
        }
    }
    
    static void showMenu(){
        System.out.println("'-----------------");
        System.out.println("1/ Reservar");
        System.out.println("2/ Ver Asientos");
        System.out.println("3/ Salir");
        System.out.println("Tecle su opcion: ");
    }

    static void checkOption(int option){
        switch (option) {
            case 1: reservarAsiento();
                break;
            case 2: showAll();
                break;
        
            default: System.out.println("Opcion no valida vuelva a intentarlo ");;
                break;
        }
    }

    static void reservarAsiento(){
        int [] option = {0,0};
        while (true) {
            System.out.println("Elija una fila disponible: ");
            option[0] = in.nextInt();
            System.out.println("Elija un asiento disponible: ");
            option[1] = in.nextInt();
            if(option[0]<0 || option[0] > 9 || option[1]<0 || option[1] > 9){
                System.out.println("Numero de asientos invalido, por favor elija numeros entro 0 y 9");
            } else {
                if (reservas[option[0]][option[1]] == 'L') {
                    reservas[option[0]][option[1]] = 'X';
                    System.out.println("Asiento " + option[0] + "/" + option[1] + " reservado");
                    break;
                } 
                System.out.println("Asiento no disponible...");
            }
            
        }
    }

    public static void main(String[] args) {
        fillData();
        
        int option = 0;
        do {
            showMenu();
            option = in.nextInt();
            if(option!= 3){
               checkOption(option);
            } else{
                System.out.println("Saliendo ... ");
            }

        } while (option != 3);
        in.close();
        System.out.println("Sistema Cerrado");

    }


}
