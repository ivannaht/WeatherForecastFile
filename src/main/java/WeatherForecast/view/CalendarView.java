
package WeatherForecast.view;


import WeatherForecast.model.Calendar;
import WeatherForecast.model.Weather;

public class CalendarView {
    public void listAllDays(Calendar[] days) {
        for (Calendar calendar: days) {
            System.out.print(calendar.getNameOfday());
            System.out.println(" "+ calendar.getDate());

               }}


        public void forecastAllDays (Calendar[] days) {
            for (Calendar calendar: days) {
               if (calendar == null) {
                  continue;
              }
                System.out.println(calendar);



    }
            }

}
