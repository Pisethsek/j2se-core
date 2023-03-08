package classes.ass8;

public class LocalVariable {

    private int id = 1002;

    void print(){
        class Person{
            String name = "seth";
            void hello(){
                System.out.println("Hello "+id +"\t"+name);
            }
        }
        Person obj = new Person();
        obj.hello();
    }

    public static void main(String[] args) {
        LocalVariable obj = new LocalVariable();
        obj.print();
    }
}
