import javax.swing.*;

public class Main {
    public static void ccap(Animals mur) {
        mur.speak();
    }
    public static void main(String args[]) {
        Cat cat_murka = new Cat(4500, "Murka", 11);
        Dog sharik = new Dog(900, "Sharikk", 1);
        ccap(cat_murka);
        ccap(sharik);

    }
}
