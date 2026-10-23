public class Booking {
    private String id;
    private Flight flight;
    private Passenger passenger;
    private int tickets;
    private double subtotal;
    private double discount;
    private double total;

    public Booking(String id, Flight flight,
                   Passenger passenger, int tickets) {
        this.id = id;
        this.flight = flight;
        this.passenger = passenger;
        this.tickets = tickets;

        subtotal = flight.getFare() * tickets;
        discount = subtotal * passenger.getDiscount() / 100;
        total = subtotal - discount;
    }

    public void display() {
        System.out.println("\n===== BOOKING SUMMARY =====");
        System.out.println("Booking ID: " + id);
        System.out.println("Passenger: " + passenger.getName());
        System.out.println("Age: " + passenger.getAge());
        System.out.println("Passenger Type: " + passenger.getType());
        System.out.println("Flight: " + flight.getCode());
        System.out.println("Tickets: " + tickets);
        System.out.printf("Subtotal: Rs. %.2f%n", subtotal);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Final Amount: Rs. %.2f%n", total);
    }
}