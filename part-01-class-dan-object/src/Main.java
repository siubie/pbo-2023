public class Main {
    public static void main(String[] args) {
        Komentar komentarBaik = new Komentar("Nama", "Email", "Komentar Baik");
        Komentar komentarPedes = new Komentar("Nama", "Email", "Komentar Pedes");

        BukuTamu bukuTamu = new BukuTamu();
        bukuTamu.addKomentar(komentarBaik);
        bukuTamu.addKomentar(komentarPedes);
    }
}