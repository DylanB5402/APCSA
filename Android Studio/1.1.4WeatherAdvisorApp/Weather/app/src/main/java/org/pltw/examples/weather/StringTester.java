package org.pltw.examples.weather;
/**
 * Write a description of class StringTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringTester {
    private static String weatherCondition;
    
    // instance variables - replace the example below with your own
    public static void main() {
        weatherCondition = "freezing drizzle";
        System.out.println(getFirstWord(weatherCondition));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "snowy snow"));
 
   
    }
    
    public static String getFirstWord(String word) {
        return word.substring(0, word.indexOf(" "));
    }
    
}
