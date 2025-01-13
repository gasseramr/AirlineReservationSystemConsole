public class Passenger {
    private String passengerName;
    private String passengerID;
    private String flightNumber;

    // Constructor
    public Passenger(String passengerName, String passengerID, String flightNumber) {
        this.passengerName = passengerName;
        this.passengerID = passengerID;
        this.flightNumber = flightNumber;
    }

    // Getters and Setters
    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(String passengerID) {
        this.passengerID = passengerID;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    // Additional methods as needed

    // Additional method to display passenger information
    public String displayPassengerDetails() {
        return "Passenger " + passengerName + " (ID: " + passengerID + ") - Flight: " + flightNumber;
    }

    // Additional method to update passenger details
    public void updatePassengerDetails(String passengerName, String passengerID, String flightNumber) {
        this.passengerName = passengerName;
        this.passengerID = passengerID;
        this.flightNumber = flightNumber;
    }
}


