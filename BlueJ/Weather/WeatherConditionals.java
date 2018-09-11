
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String condition) {
        Boolean windy;
        
        if (condition.toLowerCase().contains("windy")) {
            windy = true;
        }
        
        return (Integer.toString(temperature) + " degrees and " + condition);
    }
}
