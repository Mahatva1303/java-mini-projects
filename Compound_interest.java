import java.util.Scanner;

public class Compound_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;
        System.out.print("Enter principal amount :");
        principal = input.nextDouble();
        System.out.print("Enter the interest rate (in %) ");
        rate = input.nextDouble()/100;
        System.out.print("enter the # of times compund per year :");
        timesCompound = input.nextInt();
        System.out.print("Enter the # of years :");
        years = input.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompound, timesCompound * years );
        System.out.printf("Your principal : %.3f For year and rate of %d %.3f respectively is amount generated will be %f",principal,years,rate,amount);
        input.close();
    }
}
