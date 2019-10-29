

/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {
        String songInfo = MediaFile.readString();
        int count = 0;
        double words = 0;
        int songWords = 0;
        int leastNum = 10000;
        int bigNum = 0;
        String longName = "";
        int mostWords = 0;
        int leastWords = 0;
        String mostArtist = "";
        boolean moreThanOnce = false;
        String bigSong = "";
        String smallSong = "";
        String songName = "";
        while (songInfo != null) {
           count = count + 1;
           System.out.print(songInfo + "|");
           if (songInfo == songName) {
               moreThanOnce = true;
            }
           songName = songInfo;
           songInfo = MediaFile.readString();
           System.out.print(songInfo + "|");
           try {
            if (songInfo.length() > longName.length()) {
               longName = songInfo;
            }
           }
           catch (NullPointerException e) {
               longName = longName;
            }
           songInfo = MediaFile.readString();
           System.out.print(songInfo + "|");
           songInfo = MediaFile.readString();
           try {
           songWords = Integer.valueOf(songInfo);
           }
           catch (NumberFormatException e){
            songWords = 0;
           }
           try {
               mostWords = Integer.valueOf(songInfo);
               leastWords = Integer.valueOf(songInfo);
               if (mostWords > bigNum) {
                   bigNum = mostWords;
                   bigSong = songName;
                }
               if (leastWords < leastNum) {
                   leastNum = leastWords;
                   smallSong = songName;
                }
           }
           catch (NumberFormatException e) {
               bigNum = bigNum;
            }
           System.out.println(songInfo);   
           words += songWords;
           songInfo = MediaFile.readString();
           if (songInfo == null) {
               count -= 1;
           }
        }
        System.out.println("Number of Songs:" + count);
        System.out.println("Average Number of Words:" + (words/count));
        System.out.println("Song With Most Number of Words:" + bigSong);
        System.out.println("Song With Least Number of Words:" + smallSong);
        System.out.println("Artist with the Longest Name:" + longName);
        System.out.println("Artist that Appears the most Number of Times:" + mostArtist);
        System.out.println("Does a Song Appear More than Once:" + moreThanOnce);
}
}