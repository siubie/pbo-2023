import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BukuPengunjung bukuPengunjung = new BukuPengunjung();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu:");
            System.out.println("1. Tambah buku tamu");
            System.out.println("2. Lihat Buku tamu");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1/2/3): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama Anda: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan pesan Anda: ");
                    String message = scanner.nextLine();
                    System.out.println("Entri baru telah ditambahkan.");
                    break;
                case 2:
                    System.out.println("Daftar Buku Tamu:");
                    break;
                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            }
        }
    }
}