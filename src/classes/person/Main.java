package classes.person;

public class Main {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.id = 1;
        obj.name = "Sek Piseth";
        obj.gender = "Male";
        obj.address = "kep";
        obj.age = 21;
        obj.printIfo();

        Person.val = 12;

        Person obj2 = new Person();
        obj2.printIfo();

        Person obj3 = new Person("lao");

    }
}
