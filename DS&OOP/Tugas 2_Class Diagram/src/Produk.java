class Produk {

    // atribut produk
    protected String nama;
    protected int harga;

    // konstruktor
    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // info produk
    public String getInfo() {
        return nama + " - Rp" + harga;
    }

    // ambil harga
    public int getHarga() {
        return harga;
    }
}