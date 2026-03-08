public class Main {
    public static void main(String[] args) throws Exception {

        // Bagian ini menjadi implementasi Pillar Polymorphism
        // Yang memungkinkan Cheese dan Chocolate dari-
        //-class yang berbeda untuk diperlakukan seperti-
        // -objek yang sama

        Toppings myCheese = new Cheese("Mozzarella", "Rubbery", "Scentless");
        Toppings myChocolate = new Chocolate("White", "Crunchy", "Woody");
        System.out.println("");
        
        // Seperti dibawah ini, kedua class bisa memanggil-
        // -fungsi melt dan grind

        myCheese.melt();
        myCheese.grind();
        System.out.println("");
        
        myChocolate.melt();
        myChocolate.grind();
        System.out.println("");
    }
}