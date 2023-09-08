import java.util.ArrayList;
import java.util.List;

public class BukuPengunjung {
    private List<Tamu> tamuList = new ArrayList<>();

    public BukuPengunjung() {
    }

    public BukuPengunjung(List<Tamu> tamuList) {
        this.tamuList = tamuList;
    }

    public List<Tamu> getTamuList() {
        return tamuList;
    }

    public void setTamuList(List<Tamu> tamuList) {
        this.tamuList = tamuList;
    }

    public void addTamu(Tamu tamu){
        this.tamuList.add(tamu);
    }

    public void printTamu(){
        for (Tamu tamu:tamuList){
            System.out.println(tamu.getNama());
            System.out.println(tamu.getAlamat());
            System.out.println(tamu.getNomor_hp());
        }
    }
}
