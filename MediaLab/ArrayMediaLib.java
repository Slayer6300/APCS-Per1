
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{

    /**
     * Constructor for objects of class ArrayMediaLib
     */
    public static void main()
    {
        String[] sharingFriends = {"Vishal",
                   "Prem",
                   "Neil",
                   // "Kai",
                   "Jacob" 
        };
        for (int i = 0; i < sharingFriends.length; i++)
        {
          System.out.println(sharingFriends[i]);
        }
    }
    public static double getAvg(int[] daysBtwnPurchase)
    {
     double total = 0;
     for (int val : daysBtwnPurchase)
     {
       total  = total + val;
     }
     return total / daysBtwnPurchase.length;
    }
    public static void main(String[] args)
    {
     int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
     System.out.println(getAvg(daysBtwnPurchase));
    }
    public static void topTenSongs() {
    Song[] topTenSongs = {new Song("Country Roads"),
                      new Song("All-Star"),
                      new Song("Old Town Road"),
                      new Song("Bad Guy"),
                      new Song("Scooby Doo Theme Song"),
                      new Song("Megalovania"),
                      new Song("a"),
                      new Song("b"),
                      new Song("c"),
                      new Song("d")              
    };
    for (Song s: topTenSongs)
    {
      System.out.println(s.getTitle());
    }
    // change the array
    System.out.println("-BEFORE--");
    for (int i = 0; i < topTenSongs.length; i++) {
    topTenSongs[i]= new Song("test");
    System.out.println(changeSong.getTitle());
    }
    // show the array
    System.out.println("-AFTER--");
    for (Song showSong : topTenSongs) {
    System.out.println(showSong.getTitle());
    }
   }
}