import java.util.Scanner;

// class main
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pesanan pesanan = new Pesanan();

        int pilihan;

        // menu loop
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Donat Keju");
            System.out.println("2. Donat Coklat");
            System.out.println("3. Donat Vanila");
            System.out.println("4. Teh");
            System.out.println("5. Kopi");
            System.out.println("6. Selesai");

            System.out.print("Pilih: ");

            // ambil input
            pilihan = input.nextInt();

            // pilih produk
            switch (pilihan) {
                case 1:
                    pesanan.tambahProduk(new Donat("Keju"));
                    break;
                case 2:
                    pesanan.tambahProduk(new Donat("Coklat"));
                    break;
                case 3:
                    pesanan.tambahProduk(new Donat("Vanila"));
                    break;
                case 4:
                    pesanan.tambahProduk(new Minuman("Teh"));
                    break;
                case 5:
                    pesanan.tambahProduk(new Minuman("Kopi"));
                    break;
                case 6:
                    break;
                // input invalid
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while (pilihan != 6);

        // tampil pesanan
        System.out.println("\n=== PESANAN ===");
        pesanan.tampilkanPesanan();

        // pilih pembayaran
        System.out.println("\nPilih Pembayaran:");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");

        int bayar = input.nextInt();

        // set metode
        if (bayar == 1) {
            pesanan.setPembayaran(new PembayaranCash());
        } else if (bayar == 2) {
            pesanan.setPembayaran(new PembayaranQRIS());
        } else {
            System.out.println("Pilihan tidak valid, default ke Cash.");
            pesanan.setPembayaran(new PembayaranCash());
        }

        // proses akhir
        pesanan.prosesPembayaran();
        input.close();
    }
}