
/**
 * Write a description of class WeatherConditionals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;
        windy = description.contains("windy");
        if (windy == true) {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        if (temperature > 31) {
            if (description.equals("snow")) {
                if (temperature > 100) {
                    return "Might want to check you're not dreaming";
                }
                else {
                    return "It's safe to go outside" + " " + temperature + " " + "degrees and snow.";
                }
            }
            else {
                return "It's safe to go outside," + " " + temperature + " " + "degrees and sunny.";
            }
        }
        else {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
    }
    public static String getHikingAdvice(int temperature,int windchill, int humidity, String description){
        String advice = "";
        if ((temperature - windchill) > 60) {
            if ((temperature - windchill) > 95) {
                advice = advice + "It may be too hot to hike.";
            }
            else {
                advice = advice + "Temperature is good for hiking.";
            }
        }
        else {
            advice = advice + "It may be too cold to hike.";
        }
        if (humidity > 50) {
            advice = advice + " Humidity is at " + humidity + "%. Humidity level may be too high to hike.";
        }
        else {
            advice = advice + " Humidity is at " + humidity + "%. Humidity level is good for hiking.";
        }
        if (description.equals("snow")) {
            advice = advice + " You shouldn't hike, it is snowing.";
        }
        if (description.equals("rain")) {
            advice = advice + " You shouldn't hike, it is raining.";
        }
        return advice;
    }
}