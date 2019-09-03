
/**
 * The purpose of this program is to simulate a dice. In order to achieve this, we will be utilizing the Math.random() method! 
 * Basically, what this program should do is output: "The dice shows #" with # representing a randomly generated integer between 
 * 1 and 6.

Once you have completed the assignment, you can run your program and make sure the output is correct. If you would like to 
check your answer, check out the RollingDice.java file attached. If you have any questions email help@apcs.tv
 */
public class RollingDice
{
    public static void main (String[] args) {
        System.out.println("The dice shows " + ((int) (Math.random()*6 )+1 ));
    }// instance variables - replace the example below with your own
    
}
