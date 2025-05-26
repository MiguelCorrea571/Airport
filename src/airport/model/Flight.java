package airport.model;

import airport.model.interfaces.FlightInterface;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Flight implements FlightInterface {

    private final String id;
    private Plane plane;
    private Location departureLocation;
    private Location scaleLocation;
    private Location arrivalLocation;
    private LocalDateTime departureDate;
    private int hoursDurationArrival;
    private int minutesDurationArrival;
    private int hoursDurationScale;
    private int minutesDurationScale;
    private final ArrayList<Passenger> passengers;

    public Flight(String id, Plane plane, Location departureLocation, Location arrivalLocation, LocalDateTime departureDate, int hoursDurationArrival, int minutesDurationArrival) {
        this.id = id;
        this.plane = plane;
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDate = departureDate;
        this.hoursDurationArrival = hoursDurationArrival;
        this.minutesDurationArrival = minutesDurationArrival;
        this.passengers = new ArrayList<>();
        this.plane.addFlight(this);
    }

    public Flight(String id, Plane plane, Location departureLocation, Location scaleLocation, Location arrivalLocation, LocalDateTime departureDate, int hoursDurationArrival, int minutesDurationArrival, int hoursDurationScale, int minutesDurationScale) {
        this.id = id;
        this.plane = plane;
        this.departureLocation = departureLocation;
        this.scaleLocation = scaleLocation;
        this.arrivalLocation = arrivalLocation;
        this.departureDate = departureDate;
        this.hoursDurationArrival = hoursDurationArrival;
        this.minutesDurationArrival = minutesDurationArrival;
        this.hoursDurationScale = hoursDurationScale;
        this.minutesDurationScale = minutesDurationScale;
        this.passengers = new ArrayList<>();
        this.plane.addFlight(this);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public Plane getPlane() {
        return plane;
    }

    @Override
    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    @Override
    public Location getDepartureLocation() {
        return departureLocation;
    }

    @Override
    public void setDepartureLocation(Location departureLocation) {
        this.departureLocation = departureLocation;
    }

    @Override
    public Location getScaleLocation() {
        return scaleLocation;
    }

    @Override
    public void setScaleLocation(Location scaleLocation) {
        this.scaleLocation = scaleLocation;
    }

    @Override
    public Location getArrivalLocation() {
        return arrivalLocation;
    }

    @Override
    public void setArrivalLocation(Location arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    @Override
    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    @Override
    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public int getHoursDurationArrival() {
        return hoursDurationArrival;
    }

    public void setHoursDurationArrival(int hoursDurationArrival) {
        this.hoursDurationArrival = hoursDurationArrival;
    }

    public int getMinutesDurationArrival() {
        return minutesDurationArrival;
    }

    public void setMinutesDurationArrival(int minutesDurationArrival) {
        this.minutesDurationArrival = minutesDurationArrival;
    }

    public int getHoursDurationScale() {
        return hoursDurationScale;
    }

    public void setHoursDurationScale(int hoursDurationScale) {
        this.hoursDurationScale = hoursDurationScale;
    }

    public int getMinutesDurationScale() {
        return minutesDurationScale;
    }

    public void setMinutesDurationScale(int minutesDurationScale) {
        this.minutesDurationScale = minutesDurationScale;
    }

    @Override
    public List<Passenger> getPassengers() {
        return passengers;
    }
    @Override
    public void delay(int hours, int minutes) {
        this.departureDate = this.departureDate.plusHours(hours).plusMinutes(minutes);
    }

    @Override
    public LocalDateTime calculateArrivalDate() {
        return departureDate.plusHours(hoursDurationScale).plusMinutes(minutesDurationScale).plusHours(hoursDurationArrival).plusMinutes(minutesDurationArrival);
    }
}
