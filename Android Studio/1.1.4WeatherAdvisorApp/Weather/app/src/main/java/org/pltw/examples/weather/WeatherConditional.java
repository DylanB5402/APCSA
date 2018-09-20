package org.pltw.examples.weather;

/**
 * Created by wdumas on 3/3/16.
 */
public class WeatherConditional {

    public static String getWeatherAdvice(int temperature, String description){
        if (temperature >= 65 && description.equalsIgnoreCase("Cloudy")) {
            return "You're in San Jose.";
        }
        else if (description.equalsIgnoreCase("Fair")) {
            return "You're in Santa Fe.";
        }
        else {
            return "Bring an Umbrella!";
        }
    }
}
