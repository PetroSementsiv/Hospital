import javax.xml.crypto.Data;
import java.util.ArrayList;

public class WorkCalendar {
    private Data date;
    private ArrayList<City> cities;

    public Data getDate() {
        return date;
    }

    public void setDate(Data date) {
        this.date = date;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}

