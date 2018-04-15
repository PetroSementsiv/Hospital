import java.util.ArrayList;

public class Hospital {
    private String adress;
    private  String name;
    private  ArrayList<Doctor> doctors;

    public String getAdress() {
        return adress;
    }

    public Hospital(String adress, String name) {
        this.adress = adress;
        this.name = name;
        this.doctors = new ArrayList<Doctor>();
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }
}
