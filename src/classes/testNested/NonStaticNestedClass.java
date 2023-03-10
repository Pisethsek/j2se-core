package classes.testNested;

public class NonStaticNestedClass {

    int val = 1002;

    class People{
        void getMsg(){
            System.out.println("Hello From get msg.");
        }
    }

    public static void main(String[] args) {
        NonStaticNestedClass obj =  new NonStaticNestedClass();
        NonStaticNestedClass.People obj1 = obj.new People();
        obj1.getMsg();

    }
}
