package classes.demo_nested_class;

public class StaticNestedClass {

    static int id = 1001;

    static class People{
        int id;

        void print(){
            System.out.println("This is people id "+this.id);
            System.out.println("This is Outter id "+StaticNestedClass.id);
        }
    }

    public static void main(String[] args) {
//        StaticNestedClass.People obj = new People();
        StaticNestedClass.People obj = new StaticNestedClass.People();
        obj.print();


    }
}
