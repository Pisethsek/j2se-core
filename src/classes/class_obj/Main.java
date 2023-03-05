package classes.class_obj;

//create a class
class Bicycle {

    // state or field
    int gear = 5;

    // behavior or method
    public void braking() {
        System.out.println("Working of Braking");
    }

}

public class Main {
    public static void main(String[] args) {
        // for Bicycle class
        Bicycle sportsBicycle = new Bicycle();

        Bicycle touringBicycle = new Bicycle();

        // access field and method
        int a = sportsBicycle.gear;
        sportsBicycle.braking();
    }
}
