
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");
        int numSongs = 0;
        double avgCost = 0;
        Song song1 = new Song("Sicko Mode", .99, 6, 1);
        System.out.println("#" + song1.getNumber() + " " + song1.getTitle() + " " + "Price:" + song1.getPrice() + " " + "Rating:" + song1.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song1.getPrice();
        Song song2 = new Song("Megolovania", .99, 10, 2);
        System.out.println("#" + song2.getNumber() + " " + song2.getTitle() + " " + "Price:"  + song2.getPrice() + " " + "Rating:"  + song2.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song2.getPrice();
        Song song3 = new Song("Crab Rave", .29, 4, 3);
        System.out.println("#" + song3.getNumber() + " " + song3.getTitle() + " " + "Price:"  + song3.getPrice() + " " + "Rating:"  + song3.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song3.getPrice();
        Song song4 = new Song("Congratulations", 3.99, 10, 4);
        System.out.println("#" + song4.getNumber() + " " + song4.getTitle() + " " + "Price:"  + song4.getPrice() + " " + "Rating:"  + song4.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song4.getPrice();
        Song song5 = new Song("It's Everyday Bro", .39, 1, 5);
        System.out.println("#" + song5.getNumber() + " " + song5.getTitle() + " " + "Price:"  + song5.getPrice() + " " + "Rating:"  + song5.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song5.getPrice();
        Song song6 = new Song("Old Town Road", 2.99, 7, 6);
        System.out.println("#" + song6.getNumber() + " " + song6.getTitle() + " " + "Price:"  + song6.getPrice() + " " + "Rating:"  + song6.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song6.getPrice();
        Song song7 = new Song("Revenge", 4.99, 10, 7);
        System.out.println("#" + song7.getNumber() + " " + song7.getTitle() + " " + "Price:"  + song7.getPrice() + " " + "Rating:"  + song7.getRating());
        numSongs = numSongs + 1;
        avgCost = avgCost + song7.getPrice();
        System.out.println("Number of Songs:" + numSongs);
        System.out.println("Average Song Cost:" + " " + (avgCost/numSongs));
        Movie movie1 = new Movie();
        System.out.println(movie1);
        movie1.setTitle("Avengers:Infinity War");
        System.out.println(movie1.getTitle());
        movie1.setYear(2018);
        System.out.println(movie1.getYear());
        movie1.setDirector("Directed by Anthony and Joe Russo");
        System.out.println(movie1.getDirector());
        movie1.setMoney(2.048);
        System.out.println(movie1.getMoney());
        Book book1 = new Book("Harry Potter and the Deathly Hallows",10.99, 7, 1);
        System.out.println("#" + book1.getNumber() + " " + book1.getTitle() + " " + "Pages:" + book1.getPages() + " " + "Rating:" + book1.getRating());
        book1.setPages(659);
        System.out.println(book1.getPages());
        book1.setAuthor("Written by J.K. Rowling");
        System.out.println(book1.getAuthor());
        book1.setCopies(44000000);
        System.out.println(book1.getCopies());
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());
        MediaFile.saveAndClose();
    }
}
