import java.util.Scanner;
public class MAB_LIB_Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter an adjective (description) no 1 : ");
        String adjective1 = input.nextLine();
        System.out.print("enter noun (animal or person) : ");
        String noun1 = input.nextLine();
        System.out.print("enter adjective (description) no 2 : ");
        String adjective2 = input.nextLine();
        System.out.print("enter verb (action) end with -ing : ");
        String verb1 = input.nextLine();
        System.out.print("enter adjective (description) no 3 : ");
        String adjective3 = input.nextLine();



        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        input.close();

    }
}
