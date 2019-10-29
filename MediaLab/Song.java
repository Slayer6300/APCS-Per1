
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private String genre;
    private double price;
    private boolean favorite;
    private int number;
    private double avgCost;
    private int numSongs;

    /**
     * Constructor for objects of class Song
     */
    public Song(String title, double price, int rating, int number) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.number = number;
    }
    public Song(String title){
        this.title = title;
    }
    public String getTitle() 
    {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public int getRating()
    {
        return rating;
    }
    
    public void setRating(int r) {
        rating = r;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenre(String g) {
        genre = g;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double p) {
        price = p;
    }
    
    public void addToFavorites(){
        favorite = true;
    }
    
    public int getNumber()
    {
        return number;
    }
    
    public void setNumber(int n) {
        rating = n;
    }
    
    public void set(double p) {
        price = p;
    }
   
}