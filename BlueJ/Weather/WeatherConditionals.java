
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals {
    
    private static Boolean windy, snow;
    private static String shortCondition;
    
    public static String getWeatherAdvice(int temperature, String condition) {
        
        
        if (temperature >= 100 && condition.toLowerCase().contains("snow")) {
            return "I somehow doubt it's snowing in " + Integer.toString(temperature) + " degree heat";
        }
        else if (temperature <= 32) {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        else if (temperature > 32) {
            if (condition.toLowerCase().contains("windy")) {
                windy = true;
                shortCondition = "windy";
            }
            else if (condition.toLowerCase().contains("snow")) {
                snow = true;
                shortCondition = "snow";
            }
            else if (condition.toLowerCase().contains("sunny")) {
                snow = true;
                shortCondition = "sunny";
            }
            return "It's safe to go outside, " + Integer.toString(temperature) + " degrees and " + shortCondition + ".";
        }
        else {
            return (Integer.toString(temperature) + " degrees and " + condition);
        }
        
    }
}
