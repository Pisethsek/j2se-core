package classes.class_data_member;

class Dog{
    static Integer id; //instance of class
    String name; //instance of object
    Dog(){}
}
public class Static {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Lu Lu"; //call instance obj

        Dog.id = 100; //call instance of class

    }
}
