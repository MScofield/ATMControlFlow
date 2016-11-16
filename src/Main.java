import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner (System.in);
    public static Scanner scanner1 = new Scanner (System.in);
    int i = scanner1.nextInt();
    public static Customer customer = new Customer();

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome, customer.");

        customer.keyName();
        customer.keyMenu();
        customer.withDrawl();
    }
}
