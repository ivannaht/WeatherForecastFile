package WeatherForecast.controller;


import WeatherForecast.Utils.Utils;
import WeatherForecast.model.Weather;
import WeatherForecast.view.WeatherView;

public class WeatherController implements WeatherForecast.controller.ICommands {

    public void list() {
        Weather[] conditions = Utils.getWeather();
        WeatherView weatherView = new WeatherView();
        weatherView.listAll(conditions);
    }


            public String[] getCommands() {
            String[] commands = {"list", "forecast for a day", "forecast for a week"};
            return commands;
        }


    }




