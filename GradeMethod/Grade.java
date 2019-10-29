
/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grade
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Grade
     */
    public Grade()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void gradeMethod(int grade)
    {
        if (grade < 0 || grade > 100) {
            System.out.println("Invalid");
        }
        else {
            if (grade >= 90) {
                System.out.println("A");
            }
            else if (grade >= 80) {
                System.out.println("B");
            }
            else if (grade >= 70) {
                System.out.println("C");
            }
            else if (grade >= 60) {
                System.out.println("D");
            }
            else System.out.println("F");
        }
    }
}
