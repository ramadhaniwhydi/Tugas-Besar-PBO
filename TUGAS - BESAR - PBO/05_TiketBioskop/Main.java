import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Tiket> daftarTiket = new ArrayList<>();

        daftarTiket.add(new Tiket("T001", "Avengers", "Reguler", 40000, 2));
        daftarTiket.add(new Tiket("T002", "Doraemon", "Anak", 30000, 3));
        daftarTiket.add(new Tiket("T003", "Interstellar", "Premium", 60000, 1));

        System.out.println("SISTEM PEMESANAN TIKET BIOSKOP");
        double totalPendapatan = 0;

        for (Tiket tiket : daftarTiket) {
            tiket.tampilData();
            totalPendapatan += tiket.hitungTotal();
        }

        System.out.printf("Total semua pemesanan: Rp%.0f%n", totalPendapatan);
    }
}
