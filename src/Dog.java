public class Dog extends Animals{
    public Dog(int weight, String name, int age) {
        super(weight, name, age);
    }
    @Override
    public void speak() {
        System.out.println("гав гав");
    }
}
