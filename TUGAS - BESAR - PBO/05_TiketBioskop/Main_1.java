public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("BK001", "Laskar Pelangi", "Andrea Hirata", 85000);
        Buku buku2 = new Buku("BK002", "Bumi", "Tere Liye", 95000);

        System.out.println("DATA INVENTARIS BUKU");
        buku1.tampilData();
        buku2.tampilData();
    }
}
