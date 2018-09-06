
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;

    /**
     * Constructor for objects of class Book
     */
    public Book(String title, int rating, double price) {
        this.title = title;
        this.rating = rating;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String t) {
        title = t;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int r) {
        rating = r;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double p) {
        price = p;
    }
}
