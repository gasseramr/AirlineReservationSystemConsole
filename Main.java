import java.util.Scanner;

class AirlineReservationSystemConsole {

    private static FlightManager flightManager = new FlightManager();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addFlight();
                    break;
                case 2:
                    viewFlights();
                    break;
                case 3:
                    bookSeat();
                    break;
                case 4:
                    cancelReservation();
                    break;
                case 5:
                    System.out.println("Exiting Airline Reservation System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != 5);
    }

    private static void displayMenu() {
        System.out.println("Welcome to Airline Reservation System!");
        System.out.println("1. Add Flight");
        System.out.println("2. View Flights");
        System.out.println("3. Book Seat");
        System.out.println("4. Cancel Reservation");
        System.out.println("5. Exit");
    }

    private static void addFlight() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adding Flight:");
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.print("Enter departure location: ");
        String departure = scanner.nextLine();
        System.out.print("Enter destination: ");
        String destination = scanner.nextLine();
        System.out.print("Enter departure time (HH:MM): ");
        String departureTime = scanner.nextLine();
        System.out.print("Enter arrival time (HH:MM): ");
        String arrivalTime = scanner.nextLine();
        System.out.print("Enter available seats: ");
        int availableSeats = scanner.nextInt();

        Flight newFlight = new Flight(flightNumber, departure, destination, departureTime, arrivalTime, availableSeats);
        flightManager.addFlight(newFlight);
        System.out.println("Flight added successfully!");
    }

    private static void viewFlights() {
        System.out.println("Viewing Flights:");
        flightManager.viewFlights();
    }

    private static void bookSeat() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Booking Seat:");
        System.out.print("Enter flight number: ");
        String flightNumber = scanner.nextLine();

        Flight flight = flightManager.findFlightByNumber(flightNumber);
        if (flight != null && !flight.isFull()) {
            System.out.print("Enter passenger name: ");
            String passengerName = scanner.nextLine();
            System.out.print("Enter passenger ID: ");
            String passengerID = scanner.nextLine();

            Passenger newPassenger = new Passenger(passengerName, passengerID, flightNumber);
            flightManager.bookSeat(flightNumber, newPassenger);
            System.out.println("Seat booked successfully for " + passengerName + " on flight " + flightNumber + "!");
        } else {
            System.out.println("Error: Flight not found or no available seats.");
        }
    }

    private static void cancelReservation() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Canceling Reservation:");
        System.out.print("Enter passenger ID: ");
        String passengerID = scanner.nextLine();

        flightManager.cancelReservation(passengerID);
        System.out.println("Reservation canceled successfully!");
    }
}

