import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter customer type (Premium/Gold/Silver/Normal):");
        String customerType = scanner.nextLine();

        Customer customer = new Customer(customerName, customerType);

        System.out.println("Enter sale date (YYYY-MM-DD):");
        String saleDate = scanner.nextLine();

        Sale sale = new Sale(customer, saleDate);

        System.out.println("Enter service expense:");
        double serviceExpense = scanner.nextDouble();
        sale.setServiceExpense(serviceExpense);

        System.out.println("Enter product expense:");
        double productExpense = scanner.nextDouble();
        sale.setProductExpense(productExpense);

        sale.displayInfo();

        scanner.close();
    }
}