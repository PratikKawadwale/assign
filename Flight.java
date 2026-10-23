public class Flight {
    private String code;
    private String airline;
    private String source;
    private String destination;
    private int seats;
    private double fare;

    public Flight(String code, String airline, String source,
                  String destination, int seats, double fare) {
        this.code = code;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
        this.fare = fare;
    }

    public String getCode() {
        return code;
    }

    public int getSeats() {
        return seats;
    }

    public double getFare() {
        return fare;
    }

    public void bookSeats(int tickets) {
        seats -= tickets;
    }

    public void display() {
        System.out.println(code + " | " + airline + " | "+ source + " to " + destination + " | Seats: " + seats + " | Fare: Rs. " + fare);
    }
}