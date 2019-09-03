import java.util.Scanner;

public class BigNumber
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int num1;
        
        System.out.println("Enter a big number");
        num1 = s.nextInt();
        
        if (num1 > 100) {
            System.out.println("You have a big number");
        }
        else {
            System.out.println("You have a small number");
        }
    }

    
}
