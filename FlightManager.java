import java.util.ArrayList;
import java.util.List;


public class FlightManager {
    private ArrayList<Flight> flights;
    private ArrayList<Passenger> reservations;

    public FlightManager() {
        this.flights = new ArrayList<>();
        this.reservations = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void viewFlights() {
        for (Flight flight : flights) {
            System.out.println(flightDetails(flight));
        }
    }

    public void bookSeat(String flightNumber, Passenger passenger) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber) && flight.getAvailableSeats() > 0) {
                flight.setAvailableSeats(flight.getAvailableSeats() - 1);
                reservations.add(passenger);
                System.out.println("Seat booked successfully for " + passenger.getPassengerName() +
                        " on flight " + flightNumber + "!");
                return;
            }
        }
        System.out.println("Error: Flight not found or no available seats.");
    }

    public void cancelReservation(String passengerID) {
        for (Passenger passenger : reservations) {
            if (passenger.getPassengerID().equals(passengerID)) {
                for (Flight flight : flights) {
                    if (flight.getFlightNumber().equals(passenger.getFlightNumber())) {
                        flight.setAvailableSeats(flight.getAvailableSeats() + 1);
                        reservations.remove(passenger);
                        System.out.println("Reservation canceled successfully for passenger " +
                                passenger.getPassengerName() + "!");
                        return;
                    }
                }
            }
        }
        System.out.println("Error: Reservation not found.");
    }

    private String flightDetails(Flight flight) {
        return flight.getFlightNumber() + " - " + flight.getDeparture() + " to " + flight.getDestination() +
                " - " + flight.getDepartureTime() + " to " + flight.getArrivalTime() +
                " - " + flight.getAvailableSeats() + " seats available";
    }

    // Additional methods as needed

    // Additional method to search for a flight by flight number
    public Flight findFlightByNumber(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        return null; // Flight not found
    }

    // Additional method to get a list of all reservations
    public List<Passenger> getAllReservations() {
        return reservations;
    }

    // Additional method to display all reservations
    public void displayAllReservations() {
        for (Passenger passenger : reservations) {
            System.out.println(passenger.displayPassengerDetails());
        }
    }
}


