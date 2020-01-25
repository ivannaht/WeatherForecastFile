package WeatherForecast.view;


import WeatherForecast.model.Weather;

public class WeatherView {


        public void listAll(Weather[] conditions) {
            for(Weather weather: conditions) {
                if (weather == null) {
                    continue;
                }
                System.out.println(weather);
}}}
