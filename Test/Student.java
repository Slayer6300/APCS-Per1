;
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private double gpa;
    public String ethnicity;

    /**
     * Constructor for objects of class Test
     */
    public Student(double  gpa, String ethnicity)
    {
        // initialise instance variables
        this.gpa = gpa;
        this.ethnicity = ethnicity;
    }

  
    public void setGpa(double g)
    {
        gpa = g;
    }
    
    public double getGpa () {
        return gpa;
    }
    
    public void setEthnicity(String e)
    { 
        ethnicity = e;
    }
    
    public String getEthnicity() {
        return ethnicity;
    }
}
