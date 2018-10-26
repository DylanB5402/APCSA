
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    
    public static Song song1, song2, song3, song4, song5, song6, song7, song8;
    
    public static void main() {
        String song;
         song1 = new Song("Song1", 0, 1.29);
         song2 = new Song("Song2", 8, 1.29);
         song3 = new Song("Song3", 6, 0.99);
         song4 = new Song("Song4", 4, 1.29);
         song5 = new Song("Song5", 1, 1.29);
         song6 = new Song("Song6", 3, 0.99);
         song7 = new Song("Song7", 7, 0.99);
         song8 = new Song("Song8", 5, 1.29); 
       
       MediaFile.writeString(formatSongData(song1), true);
       MediaFile.writeString(formatSongData(song1), true);
       MediaFile.writeString(formatSongData(song2), true);
       MediaFile.writeString(formatSongData(song2), true);      
       MediaFile.writeString(formatSongData(song3), true);
       MediaFile.writeString(formatSongData(song3), true);
       MediaFile.writeString(formatSongData(song4), true);
       MediaFile.writeString(formatSongData(song4), true);
       MediaFile.writeString(formatSongData(song5), true);
       MediaFile.writeString(formatSongData(song5), true);
       MediaFile.writeString(formatSongData(song6), true);
       MediaFile.writeString(formatSongData(song6), true);
       MediaFile.writeString(formatSongData(song7), true);      
       MediaFile.writeString(formatSongData(song7), true);
       MediaFile.writeString(formatSongData(song8), true);
       MediaFile.writeString(formatSongData(song8), true);
       MediaFile.saveAndClose();
       
       while (!(MediaFile.readString() == null)) {
           song = MediaFile.readString();
           System.out.println("Title:" + song.substring(song.indexOf("Title") + 6, song.indexOf("Rating")));
           System.out.println("Rating:" + song.substring(song.indexOf("Rating") + 7, song.length()));
        }
    }
    
    public static String formatSongData(Song song) {
        return "Title: " + song.getTitle() + " Rating: " + song.getRating();
    }
    
    
}
