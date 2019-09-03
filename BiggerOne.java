
/**
 *Create a program that prompts the user for 2 integers. 
 *Create a static isBigger method within the BiggerOne class that takes an 2 integer as a 
 *parameters and returns a Integer which contains the value of the bigger number. 
 *Then, in the main method, print out the bigger number in the console. 
 *If both numbers are the same, simply print out one of the numbers.
 */
import java.util.Scanner;
public class BiggerOne
{
    public static void main (String[] args){
        Scanner s = new Scanner( System.in);
        int num1;
        int num2;
        System.out.println("Enter a number");
        num1 = s.nextInt();
        System.out.println("Enter another number");
        num2 = s.nextInt();
        System.out.println(largerNum(num1,num2));
    }
    private static int largerNum(int x,int y){
       if (x > y){
        return x;
    } 
    else if (y > x){
        return y;
    } 
    else {
    return x;
    }
    }
   
    }

   