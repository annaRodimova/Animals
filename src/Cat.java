public class Cat extends Animals implements Predator{
    public Cat(int weight, String name, int age) {
        super(weight, name, age);
    }

    @Override
    public void speak() {
        System.out.println("мяу, мяу");
    }

    @Override
    public void eat(int weight_eat) {
        this.weight += weight_eat;
            System.out.println(weight);
    }

    @Override
    public boolean jump(int height) {
        if (height > 0)
        return true;
        else
            return false;
    }
}
