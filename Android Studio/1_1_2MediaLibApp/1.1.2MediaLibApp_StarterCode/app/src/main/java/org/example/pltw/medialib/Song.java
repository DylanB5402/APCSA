package org.example.pltw.medialib;

/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private double price;
    private String title;
    private boolean favorite;
    
    private static int numSongs;
    private static double totalCost, ratingSum;
    private static double aveRating, aveCost;
    

    /**
     * Constructor for objects of class Song
     */
    
    public Song() {
        title = "";
        rating = 0;
        price = 0;
    }
    
    public Song(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }
    
    public Song(String title, int rating, double price) {
        this.title = title;
        this.rating = rating;
        this.price = price;
        numSongs ++;
        totalCost += price;
        ratingSum += rating;
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
    
    public void setFavorite(boolean fave) {
        favorite = fave;
    }
    
    public boolean getFavorite() {
        return favorite;
    }
    
    public int getSongCount() {
        return numSongs;
    }
    
    public double getTotalCost () {
        return totalCost;
    }
    
    public double getAveRating() {
        return ratingSum/numSongs;
    }
    
    public double getAveCost() {
        return totalCost/numSongs;
    }
    
    public static void resetCounters() {
        totalCost = 0;
        ratingSum = 0;
        numSongs = 0;
    }
}
