package classes.staticClass;

public class Outer2 {
    String msg;
    int value;
    void showInfo(){
        System.out.println("Msg is "+msg);
        System.out.println("Value is "+value);
    }

    class Inner2{
        String innerMsg;
        int innerValue;

        void showInnerValue(){
            System.out.println("Inner Msg is "+innerMsg);
            System.out.println("Inner Vlaue is : "+innerValue);
        }
    }


    public static void main(String[] args) {
        Outer2 obj = new Outer2();
        Outer2.Inner2 obj2 = obj.new Inner2();
        obj2.showInnerValue();

        Outer2.Inner2 obj3 = new Outer2().new Inner2();
        obj3.showInnerValue();
    }



}
