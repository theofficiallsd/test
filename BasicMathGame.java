/*************************************************************************
 * File Name: BasicMathGame.java
 * Due Date:  2/16/2017
 * 
 * Author:  Logan Drake
 * 
 * Program Description:   This program with perform basic mathmatical operations.  
 * 
 * Input:       The user will enter three values:  First name, Value #1 (integer)
 *              and Value #2 (decimal number)
 * Processing:  Calculate the sum, product, and modulus (remainder).
 * Output:      Print the sum, product, and modulus to the screen.
 * 
 * ***********************************************************************/

import java.util.Scanner;

public class BasicMathGame
{
    public static void main(String[] args)
    {
        /************************************************************************************************
        //Step 1:   Declare SIX Variables - Four doubles (for which three of the four variables have been  
        //          declared for you), One double, and One String (which is declared for you).
        
        //Explaination:
                    The String variable will capture the user's first name from the keyboard.  
        //          The three variables declared below will store the results for calculating the sum, 
        //          product and the modulus (remainder).  
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO DECLARE TWO VARIABLES.
        ************************************************************************************************/
        String fname = "";
        double sum = 0, product = 0, modulus = 0;
         
        //INSERT YOUR CODE BELOW
        
        //Variables
        int number;
        double decimal;


        /************************************************************************************************
        //Step 2:   Print a Welcome Banner to the screen
        ************************************************************************************************/
        
        System.out.println("\n******************************************************************************");
        System.out.println("\n**********************WELCOME TO THE BASIC MATH GAME**************************");
        System.out.println("\n******************************************************************************");
        
          
        /************************************************************************************************
        //Step 3:   Create and instantiate a Scanner object called 'input' to accept input from the 
        //          keyboard. 
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO CREATE A SCANNER OBJECT CALLED 'input'.
        *************************************************************************************************/
       
       //INSERT YOUR CODE BELOW. 
       // Create and initiate new scanner
        Scanner input = new Scanner (System.in);

    
        /************************************************************************************************
        //Step 4:   Prompt the user for their first name.
        *************************************************************************************************/
        
        System.out.print("\nPlease enter your first and last name ");
        
        
        /************************************************************************************************
        //Step 5:   (INPUT) Read the user's first name from the keyboard.
        //
        //HINT:     The nextLine() or next() method are needed.  Use the object 'input' to invoke
        //          or call the method and assign to the correct variable you declared above.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO READ THE USER'S FIRST NAME.
        *************************************************************************************************/
        
        //INSERT YOUR CODE BELOW. 
        // Read the user's first name.
        fname = input.next();
        lname = input.next();
        
        
        /************************************************************************************************
        //Step 6:   Prompt the user for two numbers, an integer and a decimal number.
        *************************************************************************************************/ 
        
        System.out.println("\n\nWelcome " + fname + "!\n");
        
        System.out.println("******************Let's Begin the Basic Math Game!****************************\n\n\n");
        
        System.out.println("Please enter your first number (an integer) and your second number (a decimal) ");
        System.out.print("separated by a space on this line then press ENTER: ");


        /************************************************************************************************
        //Step 7:   (INPUT) Read the user's two values from the keyboard. 
        //
        //HINT:     The nextInt() and nextDouble() methods are needed.  Use the object 'input' to invoke
        //          or call these methods and assign each to the correct variable you declared above.
        //
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO READ THE USER'S TWO VALUES.
        *************************************************************************************************/   
        
        //INSERT YOUR CODE BELOW.   
        // Read two values from the keyboard
        number = input.nextInt();
        decimal = input.nextDouble();

        
        
        /************************************************************************************************
        //Step 8: (PROCESSING) Calculate the summation, product and modulus of the two numbers and then
        //                     store each result in the appropriate variables.
        //
        //HINT:   Don't forget to assign the result of each calculation to a variable using the 
        //        (=) assignment operator.
        //
        //Task:   COMPLETE THIS SECTION BY WRITING THE CODE TO CALCULATE THE SUM, PRODUCT, AND MODULUS.
        *************************************************************************************************/
        
        //INSERT YOUR CODE BELOW
        // Calculate the summation, product, and modulus of the two numbers.
        sum = number + decimal;
        product = number * decimal;
        modulus = number % decimal;


        

        /************************************************************************************************
        //Step 9:   (OUTPUT) Display the results to the screen.  
        //                 
        //Task:     COMPLETE THIS SECTION BY WRITING THE CODE TO PRINT THE PRODUCT AND MODULUS.
        *************************************************************************************************/   
        
        System.out.print("\n\nThe sum of the two numbers is: ");
        System.out.println(sum);
        
        //INSERT YOUR CODE BELOW
        // Display the results to the screen
        System.out.print("\n\nThe product of the two numbers is: ");
        System.out.println(product);
        
        System.out.print("\n\nThe modulus of the two numbers is: ");
        System.out.println(modulus);
        



        /************************************************************************************************
        //Step 10:  (OUTPUT) Display the closing statement for the game, which includes the user's name.
        *************************************************************************************************/ 
        
        System.out.println("\n\n*****************************************************************************");
        System.out.println("\n      **THANK YOU " + fname + " FOR PLAYING THE BASIC MATH GAME**");
        System.out.println("\n******************************************************************************");
        
    }//end of main()
    
}//end of BasicMathGame class