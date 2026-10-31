public class Main {
    public static void main(String[] args) {
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        Menu menu2 = new Menu("M02", "Es Teh", 5000, "Minuman");
        Menu menu3 = new Menu(); // contoh constructor tanpa parameter

        System.out.println("SISTEM KAFE");
        menu1.tampilMenu();
        System.out.println("Jumlah   : 2");
        System.out.printf("Total    : Rp%.0f%n%n", menu1.hitungHarga(2));

        menu2.tampilMenu();
        System.out.println("Jumlah   : 3");
        System.out.printf("Total    : Rp%.0f%n%n", menu2.hitungHarga(3));

        System.out.println("Contoh constructor default:");
        menu3.tampilMenu();
    }
}
