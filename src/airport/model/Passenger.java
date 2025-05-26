package airport.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Passenger {

    private final long id;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private int countryPhoneCode;
    private long phone;
    private String country;
    private ArrayList<Flight> flights;    

    public Passenger(long id, String firstname, String lastname, LocalDate birthDate, int countryPhoneCode,long phone,String country) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.countryPhoneCode = countryPhoneCode;
        this.phone=phone;
        this.country=country;
        this.flights = new ArrayList<Flight>();
    }

    public String getFullName() {
        return firstname + " " + lastname;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public long getId() {
        return id;
    }
    

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public int getCountryPhoneCode() {
        return countryPhoneCode;
    }

    public long getPhone() {
        return phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountryPhoneCode(int countryPhoneCode) {
        this.countryPhoneCode = countryPhoneCode;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
