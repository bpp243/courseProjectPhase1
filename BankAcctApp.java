package courseProjectPhase1;

import java.util.Scanner;

public class BankAcctApp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Customer[] customers = new Customer[2];

    for (int i = 0; i < customers.length; i++) {
      boolean validInput = false;
      while (!validInput) {
        try {
          System.out.println("Enter details for customer " + (i + 1));

          // Collecting and validating customer data
          System.out.print("Customer ID (max 5 characters): ");
          String customerId = DataEntry.enterStringWithMaxLength(scanner.nextLine(), 5);

          System.out.print("Customer SSN (9 characters): ");
          String customerSSN = DataEntry.enterStringWithExactLength(scanner.nextLine(), 9);
          DataEntry.enterNumericString(customerSSN);

          System.out.print("Last Name (max 20 characters): ");
          String lastName = DataEntry.enterStringWithMaxLength(scanner.nextLine(), 20);

          System.out.print("First Name (max 15 characters): ");
          String firstName = DataEntry.enterStringWithMaxLength(scanner.nextLine(), 15);

          System.out.print("Street (max 20 characters): ");
          String street = DataEntry.enterStringWithMaxLength(scanner.nextLine(), 20);

          System.out.print("City (max 20 characters): ");
          String city = DataEntry.enterStringWithMaxLength(scanner.nextLine(), 20);

          System.out.print("State (2 characters): ");
          String state = DataEntry.enterStringWithExactLength(scanner.nextLine(), 2);

          System.out.print("Zip (5 characters): ");
          String zip = DataEntry.enterStringWithExactLength(scanner.nextLine(), 5);
          DataEntry.enterNumericString(zip);

          System.out.print("Phone (10 digits): ");
          String phone = DataEntry.enterStringWithExactLength(scanner.nextLine(), 10);
          DataEntry.enterNumericString(phone);

          // Creating a new Customer object
          customers[i] = new Customer(customerId, customerSSN, lastName, firstName, street, city, state, zip, phone);
          validInput = true;

        } catch (IllegalArgumentException e) {
          System.out.println("Invalid input: " + e.getMessage());
          System.out.println("Please try again.");
        }
      }
    }

    // Displaying customer details
    for (Customer customer : customers) {
      System.out.println("Customer Details:");
      System.out.println(customer.toString());
    }

    scanner.close();
  }
}