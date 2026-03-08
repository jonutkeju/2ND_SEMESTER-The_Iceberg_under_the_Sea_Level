public class Cheese extends Toppings{

    // Bagian ini dan Chocolate merupakan implementasi Pillar Inheritance
    // Kedua file class menjadi subclass dari Toppings

     public Cheese(String type, String texture, String scent) {
        super(type, texture, scent);
        System.out.println("Cheese Encountered! : " + getType() + " With " + getTexture() + " Texture and Smells " + getScent());
    }

    // Bagian ini menjadi lanjutan dari Abstract
    // Program dalam class memiliki Override
    // Yang sebelumnya telah didefinisikan di Toppings.java

    @Override
    public void melt() {
        System.out.println(getType() + " Cheese is melted, turning its " + getScent() + " smell into a good stinky scent");
    }
    @Override
    public void grind() {
        System.out.println(getType() + " Cheese is no longer " + getTexture() + " and turns into a solid paste instead");
    }
}
