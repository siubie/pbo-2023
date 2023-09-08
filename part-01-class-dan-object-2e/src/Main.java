import java.util.Scanner;

//todo : 1 kasi try catch biar ga error
//todo : 2 user pengen di format tampilan cetak nya
// =============================
// nama
// alamat
// nomor hp
// =============================
//todo : 3 setelah seminggu client minta ditambahkan field baru yaitu komentar.

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
                    addBukuTamu(scanner, bukuPengunjung);
                    break;
                case 2:
                    lihatBukuTamu(bukuPengunjung);
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

    private static void lihatBukuTamu(BukuPengunjung bukuPengunjung) {
        bukuPengunjung.printTamu();
    }

    private static void addBukuTamu(Scanner scanner, BukuPengunjung bukuPengunjung) {
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamat = scanner.nextLine();
        System.out.print("Masukkan nomor hp: ");
        String nomor_hp = scanner.nextLine();
        Tamu tamuBaru = new Tamu(nama,alamat,nomor_hp);
        bukuPengunjung.addTamu(tamuBaru);
    }
}