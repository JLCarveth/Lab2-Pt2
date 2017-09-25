public class Main {
    public static void main(String[] args) {
        Employee o1 = new Employee("Falcao", 15.50);
        Address a1 = new Address("Queen", 48, "K1P1N2");
        Address a2 = new Address("King Edward", 800, "K1N6N5");

        o1.setHours(40);
        o1.setAddress(0, a1);
        o1.setAddress(1, a2);
    }
}