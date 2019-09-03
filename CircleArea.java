
/**
 * In this program, you will create a method that can calculate the area of a circle once it receives its radius.
 * Within the CircleArea class, create a static method called calcArea the is 
 * public, returns a double, and takes an int (radius) as a parameter. Note: this method should be static so that 
 * we can invoke it in the main method of the CircleArea class. Basically, what this method does is take the radius 
 * and return the area. As you may know, the formula to calculate the area of a circle is π * r * r. Therefore, 
 * this method should take the parameter, square it, multiply it by π, and return it. Note: Use the Math.PI constant
 * to represent π. Once you have created and coded the method, move over to the main method to test out this method.
 * In the main method, type the following line of code:

System.out.println(calcArea(3));

Once you have completed the assignment, you can run your program and make sure the output is correct. If you would like to check your answer, check out the CircleArea.java file attached. If you have any questions email help@apcs.tv

Resources for this lecture
Circle Area

 */
public class CircleArea
{
    public static void main (String[]args){
        System.out.println(calcArea(3));
    }// instance variables - replace the example below with your own
    

    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static double calcArea(int radius)
    {
        // put your code here
        return radius * radius * Math.PI;
    }
}
