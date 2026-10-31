public class Main {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda("SP001", "Sepeda Gunung", 3, 10000);
        Sepeda sepeda2 = new Sepeda("SP002", "Sepeda Lipat", 5, 8000);

        System.out.println("DATA RENTAL SEPEDA");
        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}
