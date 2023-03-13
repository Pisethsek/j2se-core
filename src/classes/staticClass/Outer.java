package classes.staticClass;

public class Outer {

    String msg;
    int value;

    static class Inner{
        String innerMsg;
        int innerValue;

        void showInfo(){
            System.out.println("Inner Msg is :"+this.innerMsg);
            System.out.println("Inner Value is : "+this.innerValue);
        }
    }

    void showInfo(){
        System.out.println("Inner Msg is :"+this.msg);
        System.out.println("Inner Value is : "+this.value);
    }

    public static void main(String[] args) {
        Outer.Inner objInner = new Inner();
        objInner.showInfo();


    }
}
