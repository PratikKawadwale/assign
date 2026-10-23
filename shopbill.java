public class shopbill {
    static double calelegst(double a, double b)
    {
        double amount = a + b;
        return amount + (amount * 18 / 100);
    }
    static double calfashgst(double c, double d) 
    {
        double amount = c + d;
        return amount + (amount * 13 / 100);
    }
    static double calfoodgst(double e) 
    {
        return e + (e * 7 / 100);
    }
    static double totalbill(double a, double b,double c, double d,double e) 
    {
        double electronics = calelegst(a, b);
        double fashion = calfashgst(c, d);
        double food = calfoodgst(e);

        return electronics + fashion + food;
    }
    static double caldisbill(double a, double b,double c, double d,double e) 
    {
        double total = totalbill(a, b, c, d, e);
        double discount = total * 20 / 100;

        return total - discount;
    }
    public static void main(String[] args) {
        double a = 100;
        double b = 100;
        double c = 100;
        double d = 100;
        double e = 100;

        double total = totalbill(a, b, c, d, e);

        double discount = total * 20 / 100;

        double finalAmount =
                caldisbill(a, b, c, d, e);

        System.out.printf("Total after GST: Rs. %.2f%n", total);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Final payable amount: Rs. %.2f%n",finalAmount);
    }   
}
