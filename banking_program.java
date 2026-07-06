import java.util.Scanner;
public class banking_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

        while(isRunning){

        System.out.println("************");
        System.out.println("Banking Program");
        System.out.println("*************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("****************");

        System.out.println("Enter your choice (1-4): ");
        choice = input.nextInt();

        switch(choice){
            case 1 -> System.out.println("Show Balance");
            case 2 -> System.out.println("DEPOSIT");
            case 3 -> System.out.println("WITHDRAW");
            case 4 -> isRunning = false;
            default -> System.out.println("INVALID CHOICE");
        }

    }

    input.close();


    }
}
