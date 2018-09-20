
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    private int rating;
    private String title;
    private double price;
    public double duration;
    private double minutes, hours;

    /**
     * Constructor for objects of class Book
     */
    public Movie(String title, int rating, double price, double duration) {
        this.duration = duration;
        this.title = title;
        this.rating = rating;
        this.price = price;
        minutes = duration % 60;
        hours = (duration - minutes)/60;
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
    
    public void setDuration(double d) {
        duration = duration;
    }
    
    public double getDuration() {
        return duration;
    }
    
    public double getHours() {
        return hours;
    }
    
    public double getMinutes() {
        return minutes;
    }
}
