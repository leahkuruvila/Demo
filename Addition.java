
/**
 * Write a description of class Addition here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Addition
{ 
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        int sum;
        
        System.out.println("Enter a number: ");
        num1 = input.nextInt();
        
        System.out.println("Enter a second number: ");
        num2 = input.nextInt();
        
        System.out.println("Enter a third number: ");
        num3 = input.nextInt();
        
        sum = num1*num2*num3;
        System.out.println("The product of these numbers is " + sum);
       
    }
}
