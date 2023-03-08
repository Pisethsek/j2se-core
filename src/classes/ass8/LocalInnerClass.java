package classes.ass8;

public class LocalInnerClass {

    private int id = 1002;

    void print(){
        class Person{
            void greeting(){
                System.out.println("Hello From Greeting.");
            }
        }

        Person obj = new Person();
        obj.greeting();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.print();
    }
}
