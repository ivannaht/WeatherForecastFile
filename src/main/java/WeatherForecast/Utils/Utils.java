package WeatherForecast.Utils;

import WeatherForecast.model.Calendar;
import WeatherForecast.model.Weather;

public class Utils {



    public static Weather[] getWeather() {

        String pres1[] = {"без опадів", "-"};
        String pres2[] = {"дощ", "-"};
        String pres3[] = {"дощ", "сніг"};
        String pres4[] = {"дощ", "сніг"};
        String pres5[] = {"дощ", "сніг"};
        String pres6[] = {"дощ", "-"};
        String pres7[] = {"дощ", "-"};


        Weather[] conditions = {
                new Weather("+7", "-2", 4, 0, pres1),
                new Weather("+7", "+2", 8, 0.3, pres2),
                new Weather("+4", "+1", 15, 8.2, pres3),
                new Weather("+3", "-2", 16, 0.9, pres4),
                new Weather("+6", "0", 12, 0.6, pres5),
                new Weather("+9", "+4", 13, 0.2, pres6),
                new Weather("+10", "+3", 13, 0.7, pres7)
                       };

        return conditions;
    }

    public static Calendar[] getDays() {
        Weather[]  conditions1 = getWeather();
        Weather[]  conditions2 = getWeather();
        Weather[]  conditions3 = getWeather();
        Weather[]  conditions4 = getWeather();
        Weather[]  conditions5 = getWeather();
        Weather[]  conditions6 = getWeather();
        Weather[]  conditions7 = getWeather();


        Calendar[] days = new Calendar[]{
                new Calendar("Monday", "27.01.2020", conditions1 ),
                new Calendar("Tuesday", "28.01.2020",conditions2),
                new Calendar("Wednesday", "29.01.2020", conditions3),
                new Calendar("Thursday", "30.01.2020",conditions4),
                new Calendar("Friday", "31.01.2020",conditions5),
                new Calendar("Saturday", "01.02.2020", conditions6),
                new Calendar("Sunday", "02.02.2020",conditions7),
        };
        return days;

    }


}








