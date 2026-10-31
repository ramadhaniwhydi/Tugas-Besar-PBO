import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pemeriksaan> daftar = new ArrayList<>();

        daftar.add(new Pemeriksaan("PX001", "Andi", "Dr. Rina", 150000));
        daftar.add(new Pemeriksaan("PX002", "Budi", "Dr. Sari", 200000));
        daftar.add(new Pemeriksaan("PX003", "Citra", "Dr. Rina", 175000));

        double totalSemua = 0;
        System.out.println("DATA PEMERIKSAAN KLINIK");

        for (Pemeriksaan p : daftar) {
            p.tampilData();
            totalSemua += p.hitungTotal();
        }

        System.out.printf("Total seluruh biaya pemeriksaan: Rp%.0f%n", totalSemua);
    }
}
