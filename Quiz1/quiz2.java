
/**
 * Write a description of class quiz2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class quiz2
{
    // instance variables - replace the example below with your own
    private int distance;
    private int time;

    /**
     * Constructor for objects of class quiz2
     */
    public quiz2()
    {
        // initialise instance variables
        distance = 500;
        time = 10;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        double speed = (double) distance / time;
        System.out.println(speed);
    }
}
