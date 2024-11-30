import java.util.*;

public class Kafe13 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equalsIgnoreCase("Diskon50")) {
            System.out.println("Anda mendapatkan diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("Diskon30")) {
            System.out.println("Anda mendapatkan diskon 30%");
        } else {
            System.out.println("Kode promo invalid");
        }

        System.out.println("==== Menu Resto Kafe ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("SIlahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungHargaTotal(int[] pilihMenu, int[] banyakItem, String kodePromo) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };
        int hargaTotal = 0;
        for (int j = 0; j < pilihMenu.length; j++) {
            hargaTotal += hargaItems[pilihMenu[j] - 1] * banyakItem[j];
        }

        if (kodePromo.equalsIgnoreCase("Diskon50")) {
            hargaTotal *= 0.5;
        } else if (kodePromo.equalsIgnoreCase("Diskon30")) {
            hargaTotal *= 0.7;
        } else {
            System.out.println("Harga invalid.");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String pelanggan = input13.nextLine();
        System.out.print("Apakah pelanggan member?: ");
        String inputMember = input13.nextLine();
        boolean member = inputMember.equals("true");
        System.out.print("Masukkan kode promo: ");
        String promo = input13.nextLine();

        Menu(pelanggan, member, promo);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input13.nextInt();

        int[] pilihanMenu = new int[jumlahPesanan];
        int[] banyakItem = new int[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("\nMaukkan nomor menu yang ingin anda pesan: ");
            pilihanMenu[i] = input13.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem[i] = input13.nextInt();
        }

        int totalHarga = hitungHargaTotal(pilihanMenu, banyakItem, promo);

        System.out.println("total harga untuk pesanan Anda: " + totalHarga);
        input13.close();
    }
}