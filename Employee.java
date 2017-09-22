import java.time.LocalTime;

/**
 * Class representation of an Employee.
 * @author John L. Carveth
 */
public class Employee {

    /**
     * The Employee's name
     */
    private String name;

    /**
     * How many hours they've worked.
     */
    private double hours;

    /**
     * How much they get paid
     */
    private double rate;

    /**
     * Any addresses they have
     */
    private Address[] addresses;

    public Employee(String name, double rate, Address[] addresses) {
        this.name = name;
        this.rate = rate;
        this.addresses = addresses;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    /**
     * Clocks the hours an employee as worked.
     * @param a < b, the time they started the shift
     * @param b > a, the time their shift ended.
     */
    public double clockHours(LocalTime a, LocalTime b) {
        if (a.compareTo(b) > -1){
            throw new IllegalArgumentException("A must be less than b.");
        }
        int hours = b.getHour() - a.getHour();
        int mins = b.getMinute() - a.getMinute();

        double worked = hours + (mins / 60);
        this.hours += worked;
        return worked;
    }
}