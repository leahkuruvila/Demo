
/** Create a program that prompts the user for 2 integers. 
 * Have it display all of the odd numbers between the 2 numbers. 
 * You may assume that the 2nd integer inputted is greater than the 1st integer inputted.
 */
import java.util.Scanner;
public class OddNumbers
{
  
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        
        
        System.out.println("Enter a number"); 
        num1 = s.nextInt();
        
        System.out.println("Enter a number greater than the first"); 
        num2 = s.nextInt();
        
        if (num1 % 2 == 0)
        {
            num1++;
        }
        
        if (num2 % 2 == 0)
        {
            num2--;
        }
        
        
        
        for (num1 = num1; num1 <= num2; num1 += 2)
        {
            
            System.out.println(num1 + " ");
            
        }
    }

    
}
