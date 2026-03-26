import java.util.ArrayList;

// class pesanan
class Pesanan {

    private ArrayList<Produk> daftarProduk = new ArrayList<>();
    private Pembayaran pembayaran;

    // tambah produk
    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    // hitung total
    public int hitungTotal() {
        int total = 0;

        for (Produk p : daftarProduk) {
            total += p.getHarga();
        }

        // diskon kecil
        if (total > 10000) {
            total -= 1000;
        }

        return total;
    }

    // set pembayaran
    public void setPembayaran(Pembayaran pembayaran) {
        this.pembayaran = pembayaran;
    }

    // proses bayar
    public void prosesPembayaran() {
        int total = hitungTotal();
        System.out.println("Total: Rp" + total);
        pembayaran.bayar(total);
    }

    // tampil pesanan
    public void tampilkanPesanan() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo());
        }
    }
}