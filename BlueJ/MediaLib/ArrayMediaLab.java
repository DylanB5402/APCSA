
/**
 * Write a description of class ArrayMediaLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLab
{
    public static void main() {
    
        /*String[] names = {"Bob", "Steve", "Vladamir", "Bob 2: Bob Returns", "Tacos"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }*/
        /*int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
        int total = 0, avg = 0;
        for (int val : daysBtwnPurchase) {
            total += val;
        }
        avg = total/daysBtwnPurchase.length;
        System.out.println(avg);*/
        
        Song[] songList = { new Song("Song1", 0, 1.29),
                         new Song("Song2", 8, 1.29),
                         new Song("Song3", 6, 0.99),
                         new Song("Song4", 4, 1.29),
                         new Song("Song5", 1, 1.29),
                         new Song("Song6", 3, 0.99),
                         new Song("Song7", 7, 0.99),
                         new Song("Song8", 5, 1.29)
                         };
        //Barva, Dylan
        Song song;
        for (int i = 0; i < songList.length; i++) {
            song = songList[i];
            //song.setTitle("test");
            if (i % 3 == 0) {
                song.setPrice(0.99);
            } else {
                song.setPrice(1.29);
            }
            System.out.println(song.getTitle());
            System.out.println(song.getPrice());
        }
        
        /*for (int i = 0; i < songList.length; i++) {
            song = songList[i];
            //song.setTitle("test");
            if (i % 2 == 0) {
                System.out.println(song.getTitle());
            } 
        }
        
        int i=0;
        for (Song s : songList) {
            if (i % 2== 0) {
                System.out.println(s.getTitle());
            }
            i++;
        }*/
    
}
}
