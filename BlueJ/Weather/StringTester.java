
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
        System.out.println(weatherCondition.length());
        System.out.println(weatherCondition.substring(0, weatherCondition.indexOf(" ")));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "freezing drizzle"));
    }
}
