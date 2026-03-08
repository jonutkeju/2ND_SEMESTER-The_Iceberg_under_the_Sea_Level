# **4 Pillar OOP**
Nama : Jonathan Steven Tjahjaputra

NRP : 5027251036

Kelas : B

Di programming berorientasi objek (OOP), terdapat empat pilar utama yang menjadi dasar dalam pengembangan perangkat lunak:

## 1. Abstraction (Abstraksi)
Abstraction adalah proses menyembunyikan detail implementasi dan hanya menampilkan fungsi penting kepada pengguna.

Tujuan: menyederhanakan kompleksitas program dan memfokuskan pada fungsi utama.

Contohnya:
```java
public abstract class Toppings {
```
Kode akan mendeklarasikan class Toppings sebagai class utama
```java
public abstract void melt();
public abstract void grind();
```
Kode akan menyembunyikan isi fungsi untuk dipakai dalam subclass


## 2. Encapsulation (Enkapsulasi)
Enkapsulasi adalah proses menyembunyikan data dalam sebuah class dan mengontrol aksesnya melalui method (getter dan setter).

Tujuan: melindungi data agar tidak diakses atau diubah secara langsung dari luar class.

Contohnya:
```java
public String getType() {
        return type;
    }
public void setType(String type) {
        this.type = type;
    }
```
Kode hanya membatasi fungsi ke get dan set


## 3. Inheritance (Pewarisan)
Inheritance adalah konsep mewariskan atribut dan method dari class induk (parent) ke class turunan (child).

Tujuan: menghindari penulisan kode yang berulang dan mempermudah pengembangan program.

Contohnya:
```java
public class Cheese extends Toppings{
```
Kode menunjukkan bahwa Cheese adalah subclass Toppings
```java
@Override
    public void melt() {
        System.out.println(getType() + " Cheese is melted, turning its " + getScent() + " smell into a good stinky scent");
    }
```
Kode menunjukkan lanjutan dari tahap Abstraksi yang diturunkan ke subclass


## 4. Polymorphism (Polimorfisme)
Polymorphism adalah kemampuan method yang sama memiliki perilaku berbeda tergantung objek yang memanggilnya.

Tujuan: membuat program lebih fleksibel dan mudah diperluas.

Contoh:
```java
Toppings myCheese = new Cheese("Mozzarella", "Rubbery", "Scentless");
Toppings myChocolate = new Chocolate("White", "Crunchy", "Woody");
```
Kode menunjukkan bahwa dua class berbeda diperlakukan sama
