package classes.chapter6;

public class Vehicle {

    //data members or instance variables
    int passenger;
    int fuelCap;
    int mpg;

    //class variable
    static int num = 3;

    //methods
    //non-return type and no parameters
    void rangeI(){
        System.out.println("Range is "+fuelCap*mpg);
    }

    //return type and no parameters
    int range(){
        return fuelCap*mpg;
    }

    //return type and with parameters
    double fuelNeeded(int mile){
        return (double) mile/mpg;
    }
}
