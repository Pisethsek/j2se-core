package classes.testNested;

public class Non {


    void dis(){
        class Person{
            void wel(){
                System.out.println("Hello");
            }
        }
        Person obj = new Person();
        obj.wel();
    }

    public static void main(String[] args) {
        Non ob = new Non();
        ob.dis();
    }
}