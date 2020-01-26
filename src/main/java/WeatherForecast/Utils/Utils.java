package WeatherForecast.Utils;

import WeatherForecast.model.Calendar;
import WeatherForecast.model.Weather;

public class Utils {



    public static Weather[] getWeather() {

        String pres1[] = {"дощ", "-"};
        String pres2[] = {"дощ", "-"};
        String pres3[] = {"дощ", "сніг"};
        String pres4[] = {"", "сніг"};
        String pres5[] = {"без опадів", ""};
        String pres6[] = {"без опадів", ""};
        String pres7[] = {"дощ", ""};


        Weather[] conditions = {
                new Weather("+8", "-1", 4, 9.1, pres1),
                new Weather("+8", "+1", 8, 0.6, pres2),
                //new Weather("+8", "-1", 4, 9.1, pres3),
                //new Weather("+8", "+1", 8, 0.6, pres4),
                //new Weather("+8", "-1", 4, 9.1, pres5),
                //new Weather("+8", "+1", 8, 0.6, pres6),
                //new Weather("+8", "-1", 4, 9.1, pres7)
                       };

        return conditions;
    }



    public static Calendar[] getDays() {

        Weather[]  conditions1 = getWeather();
       Weather[]  conditions2 = getWeather();

        Calendar[] days = new Calendar[]{
                new Calendar("Monday", "27.01.2020", conditions1),
                new Calendar("Tuesday", "28.01.2020",conditions2)
        };
        return days;

    }


}








