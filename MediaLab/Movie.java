
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{
    // instance variables - replace the example below with your own
    private int year;
    private String director;
    private double money;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Movie()
    {
        // initialise instance variables
        year = 0;
        director = "";
        money = 0.0;
    }
    
    public int getYear() 
    {
        return year;
    }
    
    public void setYear(int y) {
        year = y;
    }
     public String getTitle() 
    {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    public String getDirector()
    {
        return director;
    }
    
    public void setDirector(String d) {
        director = d;
    }
    
    public double getMoney() {
        return money;
    }
    
    public void setMoney(double m) {
        money = m;
    }
}