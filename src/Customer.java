import java.util.IntSummaryStatistics;

/**
 * Created by scofieldservices on 11/16/16.
 */

public class Customer {

    String name;
    int menu;
    int balance;
    int withdraw;


    public void keyName() throws Exception {
            System.out.println("Please enter your name on the line below:");
        name = Main.scanner.nextLine();
        if (name.isEmpty()) {
            throw new Exception ("Your daddy named you wrong, go home.");}
        else
            System.out.println("Nice to meet you," + name);}


    public void keyMenu () {
        System.out.println("Type 1 to check balance, Type 2 to withdraw funds, Type 3 to cancel. [1/2/3]");
        String menu1 = Main.scanner.nextLine();
        menu = Integer.parseInt(menu1);

        if      (menu == 1) {
            System.out.println("Have a nice day! Here is your current balance: $100.00");}
        else if (menu == 2) {
            System.out.println("Please enter amount to withdrawl on line below:");}
        else if (menu == 3) {
            System.out.println("Transaction Cancelled. Have a nice day!");}
            }

    public void withDrawl () throws Exception {

        String withdraw1 = Main.scanner1.nextLine();
        withdraw = Integer.parseInt(withdraw1);

        if (withdraw < 100){
            System.out.println("Please wait while your cash is dispensed.");}
        else if (withdraw > 0){
            System.out.println("Your balance is less that your withdrawl request. You are the weakest link - GOODBYE!");}
        else {
            throw new Exception ("I don't think this text could ever print but if it does: You are the weakest link - GOODBYE!");}
        }
//hoping to use this next object for the optional balance calculating function but I'm not quite there yet.
    public void checkBalance (){



        }

        }

