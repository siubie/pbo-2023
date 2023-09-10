public class Komentar {
    private String nama,email,komentar;


    public Komentar() {
    }

    public Komentar(String nama, String email, String komentar) {
        this.nama = nama;
        this.email = email;
        this.komentar = komentar;
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    @Override
    public String toString() {
        return "Komentar{" +
                "nama='" + nama + '\'' +
                ", email='" + email + '\'' +
                ", komentar='" + komentar + '\'' +
                '}';
    }
}
