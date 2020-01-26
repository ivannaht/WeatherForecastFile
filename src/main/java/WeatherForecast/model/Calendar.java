package WeatherForecast.model;

import java.util.Arrays;
import java.util.Objects;

public class Calendar {
    private String nameOfday;
    private String date;
    private Weather[] conditions;


    public Calendar() {
    }

    public Calendar(String nameOfday, String date, Weather[] conditions) {
        this.nameOfday = nameOfday;
        this.date = date;
        this.conditions = conditions;
    }

    public String getNameOfday() {
        return nameOfday;
    }

    public void setNameOfday(String nameOfday) {
        this.nameOfday = nameOfday;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Weather[] getConditions() {
        return conditions;
    }

    public void setConditions(Weather[] conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "Calendar{"+
                "nameOfday=" + nameOfday+
                ", date=" + date + '\'' +
        "conditions=" + Arrays.toString(conditions)+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calendar calendar = (Calendar) o;
        return Arrays.equals(conditions, calendar.conditions) &&
                Objects.equals(nameOfday,calendar.nameOfday) &&
                Objects.equals(date, calendar.date);
}

    @Override
    public int hashCode() {
        int result = Objects.hash(nameOfday, date);
        result = 31 * result + Arrays.hashCode(conditions);
        return result;
    }
}
