
package WeatherForecast.view;


import WeatherForecast.model.Calendar;
import WeatherForecast.model.Weather;

public class CalendarView {
    public void listAllDays(Calendar[] days) {
        for (Calendar calendar: days) {
            System.out.print(calendar.getNameOfday());
            System.out.print(" "+ calendar.getDate());
            System.out.print(" " + calendar.getConditions());
            System.out.println();
    }

}}
