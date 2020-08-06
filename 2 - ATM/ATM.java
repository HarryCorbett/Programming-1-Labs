import java.util.Scanner;

class ATM{

    private int balance;
    private int amount = 0;

    private Scanner sc = new Scanner(System.in);

    public static void main(String[]args){

        ATM myATM = new ATM();
        myATM.go();

    }

    /**
     * 	Start atm and display menu, loop back to the menu after each operation until quit is called
     */
    private void go() {

        boolean valid = false;

        System.out.println("Welcome to online ATM banking");

        while (!valid) {
            System.out.println("How much do you want in your account?");
            balance = sc.nextInt();
            if (balance > 0) {  // ensure starting balance is greater than 0
                valid = true;
            }
        }

        System.out.println("balance: " + balance);

        while (true) {  //Loop back to menu after each operation

            System.out.println("What do you want to do?");
            System.out.println("1 : Withdraw");
            System.out.println("2 : Deposit");
            System.out.println("3 : Inquire");
            System.out.println("4 : Quit");

            int choice = sc.nextInt();

            if (choice == 1){
                withdraw(balance);
            }else if(choice == 2){
                deposit();
            }else if(choice == 3){
                inquire();
            }else{
                quit();
            }

        }
    }


    /**
     * 	Withdraw money from the  users account
     */
    private void withdraw(int amount){

        boolean valid = false;

        System.out.println("*****************************************");
        System.out.println("              Withdrawal                 ");
        System.out.println("*****************************************");

        while(!valid){

            System.out.println("How much would you like to withdraw?");
            amount = sc.nextInt();
            if(amount > 0 && balance - amount > 0 ){ //ensure withdraw amount is not negative and that there is enough money in the account
                valid = true;
            }

        }

        balance = balance - amount;

        System.out.println("*****************************************");
        System.out.println("          Your balance is " + balance);
        System.out.println("*****************************************");


    }

    /**
     *	Deposit money into the users account
     */
    private void deposit(){

        boolean valid = false;

        System.out.println("*****************************************");
        System.out.println("              Deposit                 ");
        System.out.println("*****************************************");

        while(!valid){

            System.out.println("How much would you like to deposit?");
            amount = sc.nextInt();
            if(amount > 0){     //ensure deposit amount is not negative or 0
                valid = true;
            }

        }

        balance = balance + amount;

        System.out.println("*****************************************");
        System.out.println("          Your balance is " + balance);
        System.out.println("*****************************************");

    }

    /**
     * 	Display the users current balance
     */
    private void inquire(){

        System.out.println("*****************************************");
        System.out.println("          Your balance is " + balance);
        System.out.println("*****************************************");

    }

    /**
     * 	Quit the atm (closes program)
     */
    private void quit(){

        System.out.println("*****************************************");
        System.out.println("          Goodbye!                    ");
        System.out.println("*****************************************");
        System.exit(0);

    }

}


