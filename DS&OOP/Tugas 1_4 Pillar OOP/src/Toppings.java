public abstract class Toppings {

    // Keseluruhan file Toppings.java adalah implementasi dari Pillar Abstract
    // Karena dideklarasikan dengan keyword abstract
    // Artinya class ini tidak bisa dibuat objek secara langsung-
    // -dan hanya digunakan sebagai class dasar (parent) bagi class lain
    // Yaitu Cheese dan Chocolate

    private String type;
    private String texture;
    private String scent;

    public Toppings(String type, String texture, String scent) {
        this.type = type;
        this.texture = texture;
        this.scent = scent;
    }

    // Bagian setelah teks ini adalah implementasi dari Pillar Encapsulation
    // Karena data disembunyikan dan hanya dibatasi ke getAtribut dan setAtribut
    // Tentunya supaya data tetap aman

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getTexture() {
        return texture;
    }
    public void setTexture(String texture) {
        this.texture = texture;
    }
    public String getScent() {
        return scent;
    }
    public void setScent(String scent) {
        this.scent = scent;
    }

    // Lalu pada bagian ini juga menggunakan method Abstrak
    // Karena tidak memiliki implementasi dan harus-
    // -diimplementasikan oleh subclass yang mewarisi (Inherit) class

    public abstract void melt();
    public abstract void grind();
}
