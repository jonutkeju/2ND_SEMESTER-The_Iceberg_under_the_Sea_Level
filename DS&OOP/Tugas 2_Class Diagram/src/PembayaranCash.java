class PembayaranCash implements Pembayaran {
    @Override public void bayar(int total) {
        System.out.println("Bayar tunai: Rp" + total);
    }
}
