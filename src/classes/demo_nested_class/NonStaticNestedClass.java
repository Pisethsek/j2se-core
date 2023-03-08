package classes.demo_nested_class;

public class NonStaticNestedClass {

    private int id = 1002;

    private class People{
        void print(){
            System.out.println("The message is : "+id);
        }
    }

    public static void main(String[] args) {
        NonStaticNestedClass obj = new NonStaticNestedClass();
        NonStaticNestedClass.People peo = obj.new People();
        peo.print();
    }
}
