package classes.chapter6;

public class Main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        //minivan is an instance of vehicle
        Vehicle sportCar = new Vehicle();

        int range1, range2;

        //assign value to instance variable minivan
        minivan.fuelCap = 16;
        minivan.passenger = 10;
        minivan.mpg = 21;
        range1 = minivan.range();
        double need = minivan.fuelNeeded(minivan.mpg);
        System.out.println(range1);
        System.out.println(need);


        //assign value to sport car
        sportCar.passenger = 2;
        sportCar.mpg = 23;
        sportCar.fuelCap = 300;

        int res = sportCar.fuelCap * Vehicle.num;

        //call factor class
        Factor factor = new Factor();
        boolean isFactor = factor.isFactor(30,8);
        System.out.println(isFactor);

        //call sphere
        Sphere s = new Sphere();
        int getValue = (int) s.radius;
        System.out.println(getValue);

        //call student
        Student student = new Student();
        System.out.println(student.id);
        System.out.println(student.name);
    }
}
