public class Main {
    public static void main(String[] args) {
        Barista barista = new Barista(3000, false);

        Customer customer1 = new Customer("손님",10000, false);
        customer1.order(barista, "아메리카노");

        System.out.println("---");

        Customer customer2 = new Customer("손님",4000, false);
        customer2.order(barista, "아메리카노");

    }
}