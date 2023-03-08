package classes.abstract_dm;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Kiki", "Black");
        Bird bird = new Bird("Doca", "Brown");

        dog.status();
        dog.ability();

        System.out.println("---------------");

        bird.status();
        bird.ability();


    }
}
