package classes.demo_nested_class;

public class LocalNestedClass {

    private int id = 1002;

    void printValue(){
        System.out.println("The value is : "+id);

        class People{
            void greeting(){
                System.out.println("Hello My name is sek piseth");
            }
        }

        People p = new People();
        p.greeting();
    }

    public static void main(String[] args) {
        LocalNestedClass l = new LocalNestedClass();
        l.printValue();
    }
}
