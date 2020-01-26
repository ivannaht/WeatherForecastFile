package WeatherForecast.model;

import java.util.Arrays;
import java.util.Objects;

public class Weather  implements Comparable<Weather>{

    private String maxТemperature;
    private String minТemperature;
    private int windSpeed;
    private double precipitation;
    private String[] pres;

    public Weather() {
    }

    public Weather(String maxТemperature, String minТemperature, int windSpeed, double precipitation, String[] pres) {
        this.maxТemperature = maxТemperature;
        this.minТemperature = minТemperature;
        this.windSpeed = windSpeed;
        this.precipitation = precipitation;
        this.pres = pres;
    }

    public String getMaxТemperature() {
        return maxТemperature;
    }

    public void setMaxТemperature(String maxТemperature) {
        this.maxТemperature = maxТemperature;
    }

    public String getMinТemperature() {
        return minТemperature;
    }

    public void setMinТemperature(String minТemperature) {
        this.minТemperature = minТemperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    public String[] getPres() {
        return pres;
    }

    public void setPres(String[] pres) {
        this.pres = pres;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "maxТemperature='" + maxТemperature  +'\'' +
                ", minТemperature=" + minТemperature +
                ", windSpeed=" + windSpeed +
                ", precipitation=" + precipitation +
                ", pres=" + Arrays.toString(pres) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weather weather = (Weather) o;
        return  minТemperature == weather.minТemperature &&
                windSpeed == weather.windSpeed &&
                precipitation == weather.precipitation &&
                Objects.equals(maxТemperature, weather.maxТemperature) &&
                Arrays.equals(pres, weather.pres);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(maxТemperature, minТemperature, windSpeed, precipitation);
        result = 31 * result + Arrays.hashCode(pres);
        return result;
    }

    @Override
    public int compareTo(Weather o) {
        return Integer.compare(getWindSpeed(), o.getWindSpeed());
    }
}
