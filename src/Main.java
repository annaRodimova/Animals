import javax.swing.*;

public class Main {
    public static void main(String args[]) {
        Cat cat_murka = new Cat(4500, "Murka", 11);
        cat_murka.eat(20);
        if (cat_murka.jump(20)) {
            System.out.println("хищная");
        }
        else
            System.out.println("домашняя");
    }
}
