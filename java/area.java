import java.util.Scanner;

public class area
{
    public static void main(String[] args)
    {
      
        double length, width, perimeter;
        
        
        System.out.println("This program is designed to calculate the area and perimeter of a square or rectangle.");
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("\n Please enter the length: ");
        
        length = input.nextDouble();
        
        System.out.println("\nPlease enter the width: ");
        
        width = input.nextDouble();
        
     
        
        
        perimeter = width + width + length + length;
        System.out.println("\nYou entered " + length + " for length.");
        System.out.println("\nYou entered " + width + " for width.");
        System.out.println("\n\nThe perimeter of the square/rectangle is :" + perimeter);
        
        
        System.out.println("*************************************************");
        System.out.println("*********** THANKS FOR PLAYING ******************");
        System.out.println("*************************************************");
    }
}