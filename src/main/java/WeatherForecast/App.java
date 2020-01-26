package WeatherForecast;

import WeatherForecast.Utils.Utils;
import WeatherForecast.controller.CalendarController;
import WeatherForecast.controller.WeatherController;
import WeatherForecast.model.Calendar;
import WeatherForecast.model.Weather;
import WeatherForecast.view.GeneralView;

import java.util.Scanner;

import static WeatherForecast.Utils.Utils.getDays;
import static WeatherForecast.Utils.Utils.getWeather;


public class App
{
    public static void main( String[] args )    {

        System.out.println( "Weather forecast would be here!" );

 new App();
}

    public App() {

        String cmd;
        Scanner scanner = new Scanner(System.in);
        boolean isEnd = true;

        WeatherController weatherController = new WeatherController();
        String[] weatherCommands = weatherController.getCommands();

        CalendarController calendarController = new CalendarController();
        String[] calendarCommands = calendarController.getCommands();

        GeneralView generalView = new GeneralView();


        String generalCommands[] = { "?", "exit"};

        while(isEnd) {
            System.out.println("Enter a command:");
            cmd = scanner.nextLine();
            switch (cmd) {
                    case "?":
                    generalView.allCommands(generalCommands);
                    generalView.allCommands(weatherCommands);
                    generalView.allCommands(calendarCommands);
                    break;
                    case "calendar":
                    calendarController.list();
                    break;
                case "list":
                    weatherController.list();
                    break;
                case "exit":
                    generalView.bye();
                    isEnd = false;
                    break;
            }
        }

    }



}
