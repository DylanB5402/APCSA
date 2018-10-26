
/**
 * Write a description of class FavoritesMediaLib here.
 *
 */
public class FavoritesMediaLib {
    
    public static Song song1, song2, song3, song4, song5, song6, song7, song8;
    private static String mediaData;
    public static void main() {
        
        song1 = new Song("Song1", 0, 1.29);
         song2 = new Song("Song2", 8, 1.29);
         song3 = new Song("Song3", 10, 0.99);
         song4 = new Song("Song4", 4, 1.29);
         song5 = new Song("Song5", 1, 1.29);
         song6 = new Song("Song6", 3, 0.99);
         song7 = new Song("Song7", 7, 0.99);
         song8 = new Song("Kong8", 6, 1.29); 
         
       MediaFile.writeString(formatSongData(song1), false);
       MediaFile.writeString(formatSongData(song2), false);
       MediaFile.writeString(formatSongData(song3), false);
       MediaFile.writeString(formatSongData(song4), false);      
       MediaFile.writeString(formatSongData(song5), false);
       MediaFile.writeString(formatSongData(song6), false);
       MediaFile.writeString(formatSongData(song7), false);
       MediaFile.writeString(formatSongData(song8), false);
       MediaFile.saveAndClose();
       
       mediaData = MediaFile.readString();
       //printAllSongs();
       printFavorites();
    }

    private static void printAllSongs() {
        int index;
        String songData = mediaData;
        String song;
        while (songData.length() > 0) {
            index = songData.indexOf("|");
            song = songData.substring(0, index);
            songData = songData.substring(index + 1, songData.length());
            System.out.println(song);
        }
    }
    
    private static void printFavorites() {
        int index, rating;
        String songData = mediaData;
        String song, ratingData;
        System.out.println("Favorites");
        System.out.println("-------------");
        while (songData.length() > 0) {
            index = songData.indexOf("|");
            song = songData.substring(0, index);
            songData = songData.substring(index + 1, songData.length());
            ratingData = song.substring(song.length() -1);
            song = song.substring(song.indexOf("Title") + 6, song.indexOf("Rating"));
            rating = Integer.valueOf(ratingData);
            if (rating >= 8) {
                System.out.println(song + " (" + ratingData + ")");
            }
        }
        
    }

    public static String formatSongData(Song song) {
        return "Title:" + song.getTitle() + "Rating:" + song.getRating();
    }
}


