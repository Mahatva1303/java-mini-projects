import java.util.Scanner;
public class weight_converter_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: convert kgs to lbs");

        System.out.print("enter your Choice: ");
        choice = input.nextInt();
        if(choice == 1){
            System.out.print("Enter your weight in lbs :");
            weight = input.nextDouble();
            newWeight = weight*0.453592;
            System.out.printf("The new weight in kgs is : %.2f",newWeight);

        }
        else if(choice == 2){
            System.out.println("Enter your weight in Kgs");
            weight = input.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("the new weight in lbs is :%.2f",newWeight);

        }
        else{
            System.out.println("You entered wrog choice");
        }

        input.close();

    }
}
