      
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester
{
    // instance variables - replace the example below with your own
    public String weatherCondition;
    

    /**
     * Constructor for objects of class StringTester
     */
    public StringTester()
    {
        // initialise instance variables
        weatherCondition = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main()
    {
        String weatherCondition = "light snow showers";
        System.out.println(WeatherConditionals.getHikingAdvice(11, 5, 60, "snow"));
    }
}
