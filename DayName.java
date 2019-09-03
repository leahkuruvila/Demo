
/**
Create a program that prompts the user for an integer that represents a day in the week with 1 
representing Sunday, 2 representing Monday, and so on. Create a static getName method within the 
dayName class that takes an integer as a parameter and returns a String which contains the name of the day. 
Then, in the main method, print out the day name in the console. If the number entered is not from 1-7, inform 
the user that the number they have entered in invalid.
 */


import java.util.Scanner;
public class DayName
{
    public static void main(String[] args) {
   
    // instance variables - replace the example below with your own
    Scanner s = new Scanner( System.in);
    int userNum;
    
    System.out.println("Enter an integer from 1-7");
    userNum = s.nextInt();
    System.out.println(convert(userNum));
   

}   
private static String convert (int hi){
   //if (hi > 0 && hi <= 7){
       if (hi == 1){
        return "Sunday";
        }
        else if (hi ==2){
        return "Monday";
        }
        else if (hi ==3){
        return "Tuesday";
        }
        else if (hi ==4){
        return "Wednesday";
        }
        else if (hi ==5){
        return "Thursday";
        }
        else if (hi ==6){
        return "Friday";
        }
        else if (hi ==7){
        return "Saturday";
        }
    
    else {
        return "You have entered an invalid number";
    }
}
}


 