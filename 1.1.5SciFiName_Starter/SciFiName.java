
/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String firstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String lastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String city = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String school = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String relativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String relativeName2 = UserInput.getString();

        String first = (firstName.substring(0, 3) + lastName.substring(0, 2));
        String last = city.substring(0, 2) + school.substring(0, 3);
        String origin = relativeName1.substring(((int)(Math.random() * relativeName1.length() - 1)) + 1) + relativeName2.substring(((int)(Math.random() * relativeName2.length() - 1)) + 1);
        String firstFirst = "";
        firstFirst += first.charAt(0);
        String firstLast = "";
        firstLast += last.charAt(0);
        String firstOrigin = "";
        firstOrigin += origin.charAt(0);
        String realFirst = firstFirst.toUpperCase() + (first.substring(1, first.length())).toLowerCase();
        String realLast = firstLast.toUpperCase() + (last.substring(1, last.length())).toLowerCase();
        String realOrigin = firstOrigin.toUpperCase() + (origin.substring(1, origin.length())).toLowerCase();
        
        System.out.println("Hello " + realFirst + " " + realLast + " of " + realOrigin + ". Welcome!");
   
        
    }
}
