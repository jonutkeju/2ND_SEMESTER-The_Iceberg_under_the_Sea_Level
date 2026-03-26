class Donat extends Produk {
    private String rasa;
    public Donat(String rasa) {
        super("Donat " + rasa, 5500);
        this.rasa = rasa;
    }
}