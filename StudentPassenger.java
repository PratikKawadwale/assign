public class StudentPassenger extends Passenger {

    public StudentPassenger(String name, int age) {
        super(name, age);
    }

    @Override
    public double getDiscount() {
        return 10;
    }

    @Override
    public String getType() {
        return "Student";
    }
}