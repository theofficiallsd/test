import java.util.Scanner;

public class BasicGame
{
    public static void main(String[] args)
    {
        String fname = "";
        String lname = "";
        double sum = 0, product =0, modulud =0;
        int number;
        double decimal;
        
        
        System.out.println("**************************************************************************");
        System.out.println("**************************** WELCOME TO THE BASIC GAME *******************");
        System.out.println("**************************************************************************");
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("\nPlease enter your first and last name: ");
        
        fname = input.next();
        lname = input.next();
        //System.out.println("Please enter your last name: ");
        
        //lname = input.next();
        
        System.out.println("\nWelcome " + fname + "!\n");
        
        
        System.out.println("Please enter the first number: ");
        number = input.nextInt();
        
        System.out.println("Please enter a decimal: ");
        decimal = input.nextDouble();
        
        System.out.println("Mr. " + lname + ", you have entered the numbers " + number + " and " + decimal + ".");
        
        
        sum = number + decimal;
        product = number * decimal;
        System.out.println("\nThe sum of your entered numbers is: " + sum);
        System.out.println("\nThe product of your entered numbers is: " + product);
        
        
        System.out.println("*************************************************");
        System.out.println("*********** THANKS FOR PLAYING ******************");
        System.out.println("*************************************************");
    }
}