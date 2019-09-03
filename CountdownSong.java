
/**
 * Basics for programming in Java
 *
 * @author (John Mortensen)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CountdownSong
{ // everything in Java is a class, we will learn more latter
    
    public static void main()
    { // code blocks are in curly braces {}
        // initialise control variables for program
        Scanner s = new Scanner(System.in);
     
        int countdown;                 // integrer variable assignment, statements end in semi colon
        String bedJumpers;      // string of characters
        System.out.println("What kind of bed jumper?");
        bedJumpers = s.nextLine();
        System.out.println("How many jumps?");
        countdown = s.nextInt();

        // prepare for countdown loop
        int i = countdown;
        String space = " ";
        while (i > -1) { // while is a control flow statement, observe blocks of code

            if (i == 0) { // if and else are control flow statments
                // last message
                System.out.println("Zero little" + space + bedJumpers);
            } else {
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
                System.out.println(i + space + "little" + space + bedJumpers + space + "jumping on the bed");
                System.out.println("One fell off and broke his head");
                System.out.println("Mama called the doctor and the doctor said");
                System.out.println("no more monkeys jumping on the bed.");
            }
            
            // decrement i at end of loop
            i--;  // this is equivalent to i = i - 1, -- is a shorthand
            
        }    
    }

    
}