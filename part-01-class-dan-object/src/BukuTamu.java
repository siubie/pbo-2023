import java.util.ArrayList;
import java.util.List;

public class BukuTamu {
    private List<Komentar> komentar;

    public BukuTamu() {
       this.komentar = new ArrayList<>();
    }

    public BukuTamu(List<Komentar> komentar) {
        this.komentar = komentar;
    }

    public List<Komentar> getKomentar() {
        return komentar;
    }

    public void setKomentar(List<Komentar> komentar) {
        this.komentar = komentar;
    }

    public void addKomentar(Komentar komentar){
        this.komentar.add(komentar);
    }

    public void printKomentar(){
        for (Komentar komentar : komentar) {
            System.out.println(komentar.getNama());
            System.out.println(komentar.getEmail());
            System.out.println(komentar.getKomentar());
        }
    }

    @Override
    public String toString() {
        return "BukuTamu{" +
                "komentar=" + komentar +
                '}';
    }
}
