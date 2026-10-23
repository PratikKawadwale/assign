import java.util.ArrayList;
import java.util.Scanner;

public class FlightBookingSystem {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Flight> flights = new ArrayList<>();
    private ArrayList<Booking> bookings = new ArrayList<>();
    private int bookingCounter = 1001;

    public FlightBookingSystem() {
        flights.add(new Flight("PN101", "Air India",
                "Pune", "Delhi", 20, 4000));

        flights.add(new Flight("MB102", "IndiGo",
                "Mumbai", "Bengaluru", 15, 5000));

        flights.add(new Flight("PH103", "Akasa Air",
                "Pune", "Hyderabad", 25, 3500));
    }

    public void start() {
        while (true) {
            System.out.println("\n===== KIRAN AIR BOOKING =====");
            System.out.println("1. View Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    displayFlights();
                    break;
                case "2":
                    bookFlight();
                    break;
                case "3":
                    viewBooking();
                    break;
                case "4":
                    System.out.println("Thank you for using Kiran Air!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private void displayFlights() {
        System.out.println("\n===== AVAILABLE FLIGHTS =====");

        for (Flight f : flights) {
            f.display();
        }
    }

    private Flight findFlight(String code) {
        for (Flight f : flights) {
            if (f.getCode().equalsIgnoreCase(code)) {
                return f;
            }
        }
        return null;
    }

    private void bookFlight() {
        System.out.print("Enter flight code: ");
        Flight flight = findFlight(sc.nextLine().trim());

        if (flight == null) {
            System.out.println("Invalid flight code!");
            return;
        }

        System.out.print("Enter passenger name: ");
        String name = sc.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be blank!");
            return;
        }

        int age;
        try {
            System.out.print("Enter age: ");
            age = Integer.parseInt(sc.nextLine().trim());

            if (age <= 0) {
                System.out.println("Age must be greater than zero!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid age!");
            return;
        }

        System.out.print("Passenger type (Regular/Student): ");
        String type = sc.nextLine().trim();

        Passenger passenger;

        if (type.equalsIgnoreCase("Regular")) {
            passenger = new RegularPassenger(name, age);
        } else if (type.equalsIgnoreCase("Student")) {
            passenger = new StudentPassenger(name, age);
        } else {
            System.out.println("Invalid passenger type!");
            return;
        }

        int tickets;
        try {
            System.out.print("Enter number of tickets: ");
            tickets = Integer.parseInt(sc.nextLine().trim());

            if (tickets <= 0) {
                System.out.println("Tickets must be greater than zero!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ticket count!");
            return;
        }

        if (tickets > flight.getSeats()) {
            System.out.println("Not enough seats available!");
            return;
        }

        Booking booking = new Booking(
                "BK" + bookingCounter,
                flight, passenger, tickets
        );

        flight.bookSeats(tickets);
        bookings.add(booking);
        bookingCounter++;

        System.out.println("\nBooking successful!");
        booking.display();
    }

    private void viewBooking() {
        if (bookings.isEmpty()) {
            System.out.println("No booking found!");
            return;
        }

        bookings.get(bookings.size() - 1).display();
    }
}