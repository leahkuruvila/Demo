
/**
 * The polygon class should have at least 1 instance variable which will be an int named numSides. 
 * The class should also have overloaded constructors with one having 0 parameters and the other having 1. 
 * There should also be a getter (accessor) and setter (mutator) method to modify the instance variable. 
 * The most important component of this class is the toString() method which, when invoked, 
 * returns a String indicating the number of sides in the polygon.
 * 
 */
public class Polygon 
{
    // instance variables - replace the example below with your own
    private int numSides;

    /**
     * Constructor for objects of class Polygon
     */
    public Polygon()
    {
        // initialise instance variables
        numSides = 0;
    }
    public Polygon(int number)
    {
        // initialise instance variables
        numSides = number;
    }
    public int getNumSides () {
        return numSides;
        
    }
    public void setNumSides (int n) {
        numSides = n;
    }
    public String toString () {
    return "Number of sides:" + numSides;
    }
}

    

