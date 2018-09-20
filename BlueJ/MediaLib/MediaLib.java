/**
 * @author Dylan Barva
 * @version 1.1.3 Media Library
 */
public class MediaLib
{
    private static Book book2;
    private static Book book1;
    private static Movie movie1;
    private static Song song1, song2, song3, song4, 
    song5, song6, song7, song8;
    public static Book2 book;
    
    /**
     * Constructor for objects of class MediaLib
     */
    public MediaLib() {
    }
    
    public static void main() {

        //book1 = new Book("Harry Potter and the Deathly Hallows",8, 1.50);       
        movie1 = new Movie("Star Wars: Revenge of the Sith", 9, 7.10, 129);
        //book2 = new Book("Halo: The Fall of Reach", 8, 0); 
        
        System.out.println(movie1.getTitle());
        System.out.println("Rating:");
        System.out.println(movie1.getRating());
        System.out.println("Price:");
        System.out.println(movie1.getPrice());
        System.out.println("Movie Duration");
        System.out.println(movie1.getDuration());
        System.out.print(movie1.getHours());
        System.out.print(" Hours and ");
        System.out.print(movie1.getMinutes());
        System.out.print(" Minutes");
        
        
                /*System.out.println(book1.getTitle());
        System.out.println("Rating:");
        System.out.println(book1.getRating());
        System.out.println("Price:");
        System.out.println(book1.getPrice());
        *
                
        System.out.println(book2.getTitle());
        System.out.println("Rating:");
        System.out.println(book2.getRating());
        System.out.println("Price:");
        System.out.println(book2.getPrice());
        */
       
        /*Song.resetCounters();
        song1 = new Song("Song1", 0, 1.29);
        song2 = new Song("Song2", 8, 1.29);
        song3 = new Song("Song3", 6, 0.99);
        song4 = new Song("Song4", 4, 1.29);
        song5 = new Song("Song5", 1, 1.29);
        song6 = new Song("Song6", 3, 0.99);
        song7 = new Song("Song7", 7, 0.99);
        song8 = new Song("Song8", 5, 1.29); 
        
        
        System.out.println("Number of Songs");
        System.out.println(song1.getSongCount());
        System.out.println("Total Cost");
        System.out.println(song1.getTotalCost());
        System.out.println("Average Cost");
        System.out.println(song1.getAveCost());
        System.out.println("Average Rating");
        System.out.println(song1.getAveRating());
        */
       
       //book = new Book2("title","name", 10);
       //book.giveDiscount(15);
       //System.out.println(book.getPrice());
           
      
       
    }   
}
