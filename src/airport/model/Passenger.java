package airport.model;
     
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Passenger {

    private final long id;
    private String firstname;
    private String lastname;
    private LocalDate birthDate;
    private ContactInfo contactInfo;
    private ArrayList<Flight> flights;
    private PassengerFlightHistory flighHistory;

    public Passenger(long id, String firstname, String lastname, LocalDate birthDate,
            ContactInfo contactInfo, PassengerFlightHistory passengerflightHistory) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.contactInfo = contactInfo;
        this.flighHistory = passengerflightHistory;
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

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }
    
    public PassengerFlightHistory getFlightHistory() {
        return flighHistory;
    }
}
