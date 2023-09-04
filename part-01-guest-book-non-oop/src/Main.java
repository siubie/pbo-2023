import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<String> guestBook = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Create Guest Book");
            System.out.println("2. See Guest Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createGuestBook(scanner);
                    break;
                case 2:
                    seeGuestBook();
                    break;
                case 3:
                    System.out.println("Exiting the application. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    private static void createGuestBook(Scanner scanner) {
        System.out.println("Creating Guest Book...");
        System.out.print("Enter guest names (separated by commas): ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String input = scanner.nextLine();
        String[] names = input.split(",");

        for (String name : names) {
            guestBook.add(name.trim());
        }

        System.out.println("Guest Book created successfully!");
    }

    private static void seeGuestBook() {
        System.out.println("Guest Book:");
        for (String name : guestBook) {
            System.out.println(name);
        }
    }
}
