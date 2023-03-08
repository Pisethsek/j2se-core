package classes.ass8;

public class Outter {

    private int val = 100;

    class Inner{
        void printValue(){
            System.out.println("The value is "+val);
        }
    }

    public static void main(String[] args) {
        Outter objOuter = new Outter();
        Outter.Inner objInner = objOuter.new Inner();

        objInner.printValue();

    }
}
