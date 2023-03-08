package classes.ass8;

public class OutterClass {

    static int a = 10;


    static class InnerClass{
        static void print(){
            System.out.println("Value is "+a);
        }
    }

    public static void main(String[] args) {
//        OutterClass.InnerClass obj = new OutterClass.InnerClass();
//        obj.print();
        OutterClass.InnerClass.print();

    }
}
