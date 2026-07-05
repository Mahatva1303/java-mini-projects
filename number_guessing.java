import java.util.Random;
import java.util.Scanner;
public class number_guessing {
    public static void main(String[] args) {
        Random input = new Random();
        Scanner pro = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 101;
        System.out.println("Number guessing game");
        System.out.println("Enter minimum value :");
        min = pro.nextInt();
        System.out.println("enter maximum value :");
        max = pro.nextInt();
        int randomNumber = input.nextInt(min,max);
        System.out.printf("Guess a number between %d-%d\n ",min,max);
        do{
            System.out.println("Enter a guess");
            guess = pro.nextInt();
            attempts++;

            if(guess < randomNumber){
                System.out.println("Too Low! Try again");

            }
            else if(guess > randomNumber){
                System.out.println("Too high!");
            }
            else{
                System.out.println("Correst the number was " + randomNumber);
                System.out.println("number of attempts " + attempts);
            }

        }while(guess != randomNumber);
        System.out.println("You won");
        pro.close();

    }
    
}
