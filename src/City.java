import java.util.ArrayList;

public class City {
    private  String cityName;
    private ArrayList<Hospital> hospitals;

    public String getCityName() {
        return cityName;
    }

    public City(String cityName) {
        this.cityName = cityName;
        this.hospitals = new ArrayList<>();
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void addHospital(Hospital hospital){
        hospitals.add(hospital);

    }

}
