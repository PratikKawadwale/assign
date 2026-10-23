public class RegularPassenger extends Passenger {

    public RegularPassenger(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDiscount() {
        return 0;
    }

    @Override
    public String getType() {
        return "Regular";
    }
}