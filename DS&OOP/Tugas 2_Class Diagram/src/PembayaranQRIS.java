class PembayaranQRIS implements Pembayaran {
    @Override public void bayar(int total) {
        System.out.println("Membuat QR...");
        System.out.println("Bayar via QRIS: Rp" + total);
    }
}