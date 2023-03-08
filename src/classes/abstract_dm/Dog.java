package classes.abstract_dm;

public class Dog extends  AbstractAnimal{

    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void ability() {
        System.out.println("It can protect u at night");
    }
}
