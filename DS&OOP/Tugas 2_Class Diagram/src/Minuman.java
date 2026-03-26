class Minuman extends Produk {
    private String jenis;
    public Minuman(String jenis) {
        super(jenis, 3500);
        this.jenis = jenis;
    }
}