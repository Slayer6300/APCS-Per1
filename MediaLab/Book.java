
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int pages;
    private String author;
    private int copies;
    private String title;
    private double avgCost;
    private double price;
    private int rating;
    private int number;
    private int Int;

    /**
     * Constructor for objects of class Song
     */
    public Book(String title, double price, int rating, int number) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.number = number;
    }
    
    public int getPages() 
    {
        return pages;
    }
    
    public void setPages(int p) {
        pages = p;
    }
    
       public String getTitle() 
    {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String a) {
        author = a;
    }
    
    public int getCopies()
    {
        return copies;
    }
    
    public void setCopies(int c)
    {
        copies = c;
    }
    
    public int getNumber()
    {
        return copies;
    }
    
    public int getRating()
    {
        return rating;
    }
    
    public void setRating(int r) {
        rating = r;
    }
}