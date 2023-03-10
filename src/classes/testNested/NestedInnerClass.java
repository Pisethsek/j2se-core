package classes.testNested;

public class NestedInnerClass {

    static class People{
        int id;

        void display(){
            System.out.println("U are in static nested class");
        }
    }

    void outerClass(){
        System.out.println("U are in outer class ");
    }

    public static void main(String[] args) {
        NestedInnerClass.People obj = new People();
        obj.display();

    }
}
