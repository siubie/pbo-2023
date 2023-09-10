import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. dilengkapi code untuk menu nya.
        //2. Analisa apakah class BukuTamu dan Komentar sudah sesuai mengikuti konsep
        // Encapsulasi yang benar atau tidak.
        //3. Untuk menguji analisis cobalah rubah requirement dari komentar dimana
        // perlu ditambahkan field baru contoh alamat pada komentar.
        BukuTamu bukuTamu = new BukuTamu();
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
                    System.out.println("Create Guestbook:");
                    createGuestbook(scanner,bukuTamu);
                    break;
                case 2:
                    System.out.println("See Guestbook:");
                    seeGuestbook(scanner,bukuTamu);
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

    private static void seeGuestbook(Scanner scanner, BukuTamu bukuTamu) {
        bukuTamu.printKomentar();
    }


    private static void createGuestbook(Scanner scanner, BukuTamu bukuTamu) {
        System.out.println("Creating Guest Entry...");
        System.out.print("Enter guest name: ");
        scanner.nextLine(); // Consume the newline character left by nextInt()
        String name = scanner.nextLine();

        System.out.print("Enter guest email: ");
        String email = scanner.nextLine();

        System.out.print("Enter guest Comment: ");
        String password = scanner.nextLine();

        Komentar komentar = new Komentar(name, email, password);
        bukuTamu.addKomentar(komentar);
        System.out.println("Guest Entry created successfully!");
    }
}