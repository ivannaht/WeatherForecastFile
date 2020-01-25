package WeatherForecast.controller;


import WeatherForecast.view.WeatherView;

public class WeatherController implements WeatherForecast.controller.ICommands {

            public String[] getCommands() {
            String[] commands = {"calendar", "forecast for a day", "forecast for a week"};
            return commands;
        }




    }




