
/**
 * Create a program that prompts the user for an integer
 * Then, inform the user whether the number they have given you is positive, negative, or 0.
 */

import java.util.Scanner;
public class PositiveNegative
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num1;
        
        System.out.println("Enter a number");
        num1 = s.nextInt();
        
        if (num1 == 0){
            System.out.println("Your number is 0");
        }
        else if (num1 > 0){
            System.out.println("Your number is positive");
        }
        else {
            System.out.println("Your number is negative");
        }
        
      }
       
    }

    

