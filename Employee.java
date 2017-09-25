import java.time.LocalTime;
import java.lang.IllegalArgumentException;

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

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
        this.addresses = new Address[5];    // Each Employee can have up to 5 Addresses associated with their instance
    }

    /**
     * @return the instance's String field
     */
    public String getName() { return name; }

    /**
     * @param name the new name to set.
     */
    public void setName(String name) { this.name = name; }

    /**
     * @return how many hours the employee has worked.
     */
    public double getHours() { return hours; }

    /**
     * @param hours how many hours the employee has worked.
     */
    public void setHours(double hours) { this.hours = hours; }

    /**
     * @return the rate the employee earns.
     */
    public double getRate() { return rate; }

    /**
     * @param rate the rate to set.
     */
    public void setRate(double rate) { this.rate = rate; }

    public Address[] getAddresses() { return addresses; }

    /**
     * Sets the address at the given index.
     * @param index 0 < index < 5. The index of the array to set.
     * @param a the address to set at addresses[index]
     */
    public void setAddress(int index, Address a) {
        if (!(-1 < index && index < 5)) {
            throw new IllegalArgumentException("Index param "+index+" out of range.");
        }
        if (a == null) {
            throw new IllegalArgumentException("Cannot be null.");
        }
        this.addresses[index] = a;
    }
}