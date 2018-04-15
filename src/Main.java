import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        List<City> cities = createData();
        System.out.println("Available cities: ");
        printCities(cities);
        System.out.println("Enter  city number!");
        Scanner scanner = new Scanner(System.in);
        int enterCity = scanner.nextInt();
        City choosenCity = cities.get(enterCity);
        System.out.println("Available hospitals:");
        printHospitals(choosenCity.getHospitals());
        System.out.println("Enter hospitals number! ");
        int enterHospital = scanner.nextInt();
        Hospital choosenHospital = choosenCity.getHospitals().get(enterHospital);
        System.out.println("Available doctors: ");
        printDoctors(choosenHospital.getDoctors());
        System.out.println("Enter doctors number!");
        int enterDoctor = scanner.nextInt();
        Doctor choosenDoctor = choosenHospital.getDoctors().get(enterDoctor);
        System.out.println("Available days!");
        printDays(choosenDoctor.getAcceptDays());
        System.out.println("Choose day of visit!");
        int enterDay = scanner.nextInt();
        DayOfWeek chosenDay = choosenDoctor.getAcceptDays().get(enterDay);
        System.out.println("You choose" +choosenCity.getCityName() + " " + choosenHospital.getName() + " " + choosenDoctor.getName() + " "+choosenDoctor.getType()+" " + chosenDay.name() );




    }


    private static List<City> createData() {
        Hospital first_clinical_hospital = new Hospital("KHmelnytskogo 25", "First clinical hospital");
        first_clinical_hospital.addDoctor(new Doctor("Stepanenko", DoctorType.DANTIST, EnumSet.of(DayOfWeek.MONDAY, DayOfWeek.FRIDAY)));
        first_clinical_hospital.addDoctor(new Doctor("Petrov", DoctorType.SURGERY, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));

        Hospital second_hospital = new Hospital("Shevchenka 44", "Second hospital");
        second_hospital.addDoctor(new Doctor("Petrenko", DoctorType.DANTIST, EnumSet.of(DayOfWeek.FRIDAY, DayOfWeek.TUESDAY)));
        second_hospital.addDoctor(new Doctor("Okeksienjo", DoctorType.SURGERY, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));

        Hospital lvivska_hospital = new Hospital("KOnovaltsa 45", "Lvivska hospital");
        lvivska_hospital.addDoctor(new Doctor("Gitr", DoctorType.SURGERY, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));
        lvivska_hospital.addDoctor(new Doctor("Fifkin", DoctorType.DANTIST, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));

        Hospital biggest_hospital = new Hospital("Stusa 22", "Biggest hospital");
        biggest_hospital.addDoctor(new Doctor("Pjkkkl", DoctorType.SURGERY, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));
        biggest_hospital.addDoctor(new Doctor("Olen", DoctorType.DANTIST, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));

        Hospital new_clinics = new Hospital("Mateyky 65", "New clinics");
        new_clinics.addDoctor(new Doctor("Pfds", DoctorType.DANTIST, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));
        new_clinics.addDoctor(new Doctor("Skrypnyk", DoctorType.SURGERY, EnumSet.of(DayOfWeek.THURSDAY, DayOfWeek.TUESDAY)));


        ArrayList<City> cities = new ArrayList();
        City kyiv = new City("Kyiv");
        kyiv.addHospital(first_clinical_hospital);
        kyiv.addHospital(second_hospital);
        cities.add(kyiv);

        City lviv = new City("Lviv");
        lviv.addHospital(lvivska_hospital);
        lviv.addHospital(biggest_hospital);
        cities.add(lviv);

        City ivanoFrankivsk = new City("Ivano-Frankivsk");
        ivanoFrankivsk.addHospital(new_clinics);
        cities.add(ivanoFrankivsk);

        return cities;
    }

    public  static void printCities(List<City> cities){
        for (int i = 0; i <cities.size() ; i++) {
            System.out.println(i + " " + cities.get(i).getCityName());
        }
    }
    public  static void printHospitals(List<Hospital> hospitals){
        for (int i = 0; i <hospitals.size() ; i++) {
            System.out.println(i + " " + hospitals.get(i).getName() + hospitals.get(i).getAdress());
        }
    }
    public  static void printDoctors(List<Doctor> doctors){
        for (int i = 0; i <doctors.size() ; i++) {
            System.out.println(i + " " + doctors.get(i).getName() +doctors.get(i).getType());
        }
    }
    public  static void printDays(List<DayOfWeek> days){
        for (int i = 0; i <days.size() ; i++) {
            System.out.println(i + " " + days.get(i).name());
        }
    }
}