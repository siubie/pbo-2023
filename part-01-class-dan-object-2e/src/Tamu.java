public class Tamu {
    private String nama,alamat,nomor_hp;

    public Tamu() {
    }

    public Tamu(String nama, String alamat, String nomor_hp) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomor_hp = nomor_hp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomor_hp() {
        return nomor_hp;
    }

    public void setNomor_hp(String nomor_hp) {
        this.nomor_hp = nomor_hp;
    }

    @Override
    public String toString() {
        return "Tamu{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", nomor_hp='" + nomor_hp + '\'' +
                '}';
    }
}
