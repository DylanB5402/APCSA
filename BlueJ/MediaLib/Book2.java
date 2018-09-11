
/**
 * Write a description of class Book2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book2 {
    
	private String title;
	private String author;
	private double price;
        private String pubDate;

    /**
     * Constructor for objects of class Book2
     */
    public Book2(String title, String author, String pubDate, double price) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
        this.price = price;
    }
    
    public Book2(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.pubDate = "";
        this.price = price;
    }

    public void giveDiscount(double byPercent) {
        price = ((100 - byPercent) / 100 ) * price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double p) {
        price = p;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
}
