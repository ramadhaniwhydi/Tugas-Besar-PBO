public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor tanpa parameter
    public Menu() {
        this("M00", "Menu Belum Diisi", 0, "Umum");
    }

    // Constructor dengan parameter (overloading)
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    public void tampilMenu() {
        System.out.println("Kode     : " + kodeMenu);
        System.out.println("Nama     : " + namaMenu);
        System.out.println("Kategori : " + kategori);
        System.out.printf("Harga    : Rp%.0f%n", harga);
    }

    public double hitungHarga(int jumlah) {
        return harga * jumlah;
    }
}
