import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Doctor {
    private  String name;
    private DoctorType type;
    private List<DayOfWeek> acceptDays;
    public String getName() {
        return name;
    }

    public Doctor(String name, DoctorType type, Set<DayOfWeek> acceptDays) {
        this.name = name;
        this.type = type;
        this.acceptDays = new ArrayList<>(acceptDays);
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoctorType getType() {
        return type;
    }

    public void setType(DoctorType type) {
        this.type = type;
    }

    public List<DayOfWeek> getAcceptDays() {
        return acceptDays;
    }
}

