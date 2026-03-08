public class Chocolate extends Toppings{

    // Bagian ini dan Cheese merupakan implementasi Pillar Inheritance
    // Kedua file class menjadi subclass dari Toppings

     public Chocolate(String type, String texture, String scent) {
        super(type, texture, scent);
        System.out.println("Chocolate Encountered! : " + getType() + " With " + getTexture() + " Texture and Smells " + getScent());
    }

    // Bagian ini menjadi lanjutan dari Abstract
    // Program dalam class memiliki Override
    // Yang sebelumnya telah didefinisikan di Toppings.java

    @Override
    public void melt() {
        System.out.println(getType() + " Chocolate is melted, further elevating its " + getScent() + " smell through the whole room");
    }
    @Override
    public void grind() {
        System.out.println(getType() + " Chocolate is no longer " + getTexture() + " and clamps together into almost liquid from the friciton instead");
    }
}
