import java.util.Scanner;

public class shopping_cart_program {
    public static void main(String[] args) {
        // Shopping cart program
        Scanner input = new Scanner(System.in);

        String name;
        String item;
        double price;
        int quantity;
        double total;

        System.out.println("Whats the buyers name ?");
        name = input.nextLine();
        System.out.print("what item does " + name + " thinking  to buy ? ");
        item = input.nextLine();
        System.out.print("Price of " + item + " each is ? :");
        price = input.nextDouble();
        System.out.print("How many " + item + " would you like to buy ? ");
        quantity = input.nextInt();
        total = quantity*price;

    System.out.println("BUYERS NAME " + name + " Purchased item " + item + " Purchased quantity " + quantity + " Total :$ " + total);


        input.close();
    }
}
