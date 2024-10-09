import java.util.Scanner;

public class Banco {
    static Cliente cliente = new Cliente();
    static Scanner sc = new Scanner(System.in);
    static Boolean actions = false;
    public static void main(String[] args) {
        cliente.setName("Pedro");
        cliente.setCode("hik");
        cliente.setPassword("1234");

        System.out.println("Inicie Sesion");
        System.out.println("Ingrese user: ");
        String user = sc.nextLine();
        System.out.println("Igrese constrasenia");
        String pass = sc.nextLine();

        if(JoinSession(cliente,user,pass)){
            actions = true;
        } else{
            System.out.println("Ingreso invalido");
        }

        while (actions) {
            printMenu();
            int option = sc.nextInt();
            optionMenu(option);
        }
    }

    public static String addMoney(Cliente cliente, Double money){
        Double currentBalance = cliente.getMoney();
        Double newBalance = currentBalance + money;
        cliente.setMoney(newBalance);
        return cliente.getMoney().toString();
    }
    public static String substractMoney(Cliente cliente, Double money){
        Double currentBalance = cliente.getMoney();
        if(money > currentBalance){
            return "Your balance is less than the requested amound";
        }
        Double newBalance = currentBalance - money;
        cliente.setMoney(newBalance);
        return cliente.getMoney().toString();
    }

    public static Boolean JoinSession(Cliente cliente, String user, String password){
        return cliente.getCode().equals(user) && cliente.getPassword().equals(password);
    }

    public static void printMenu(){
        System.out.println("-------Option Menu");
        System.out.println("1------Add Money");
        System.out.println("2------Substract Money");
        System.out.println("3------Check Balance");
        System.out.println("4------exit");
    }

    public static void optionMenu(int option){
        switch (option) {
            case 1:
                System.out.println("Enter amount to deposit: ");
                Double amount  = sc.nextDouble();
                System.out.println(addMoney(cliente, amount));
                break;
        
            case 2:
                System.out.println("Enter amount to substract: ");
                Double amountToSubstract  = sc.nextDouble();
                System.out.println(substractMoney(cliente, amountToSubstract));
                break;
        
            case 3:
                System.out.println(cliente.getMoney().toString());
                break;
        
            case 4:
                actions = false;
                break;
        
            default:
                break;
        }
    }
}
