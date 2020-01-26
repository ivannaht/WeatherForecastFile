package WeatherForecast.controller;


import WeatherForecast.Utils.Utils;
import WeatherForecast.model.Calendar;
import WeatherForecast.view.CalendarView;

public class CalendarController implements WeatherForecast.controller.ICommands {

            public void list() {
            Calendar[] days = Utils.getDays();
            CalendarView calendarView = new CalendarView();
            calendarView.listAllDays(days);
        }
    public String[] getCommands() {
        String[] commands = {"calendar"};
        return commands;
    }
        }
