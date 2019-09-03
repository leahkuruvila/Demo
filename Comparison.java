
import java.util.Scanner;
public class Comparison
{
   
    
    
        public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        double num1;
        double num2;
        
        System.out.println("Enter a number: ");
        num1 = s.nextDouble();
        
        System.out.println("Enter a second number: ");
        num2 = s.nextDouble();
        
        System.out.println("Is the first number equal to the second number? " + (num1 == num2));
        System.out.println("Is the first number greater than or equal to the second? " + (num1 >= num2));
        System.out.println("Is the first number less than the seocnd number? " + (num1 < num2));
        
        
        
        
       
    }

    
}
