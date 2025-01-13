public class Flight {
    private String flightNumber;
    private String departure;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private int availableSeats;

    // Constructor
    public Flight(String flightNumber, String departure, String destination, String departureTime, String arrivalTime, int availableSeats) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
    }

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    // Additional methods as needed

    // Additional method to check if the flight is full
    public boolean isFull() {
        return availableSeats == 0;
    }

    // Additional method to display detailed flight information
    public String displayFlightDetails() {
        return "Flight " + flightNumber + " - " + departure + " to " + destination +
                " - Departure: " + departureTime + ", Arrival: " + arrivalTime +
                " - Available Seats: " + availableSeats;
    }

    // Additional method to update flight details
    public void updateFlightDetails(String departure, String destination, String departureTime, String arrivalTime, int availableSeats) {
        this.departure = departure;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
    }
}


