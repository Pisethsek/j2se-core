package classes.abstract_dm;

public class Bird extends AbstractAnimal{

    public Bird() {
    }

    public Bird(String name, String color) {
        super(name, color);
    }

    @Override
    public void ability() {
        System.out.println("It can fly around u");
    }
}
