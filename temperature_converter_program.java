import java.util.Scanner;
public class temperature_converter_program {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double temp;
    double newTemp;
    String unit;
    System.out.print("Enter the temperature ");
    temp = input.nextDouble();

    System.out.println("Convert to Celsius or Fahrenheit? (C or F) :");
    unit = input.next().toUpperCase();

    newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;
System.out.printf("%.2f°%s" ,newTemp,unit);




    input.close();
   } 
}
