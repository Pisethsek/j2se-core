package classes.chapter6;

public class Sphere {
    static final double PI = 3.14; //class var
    static int count = 0; //class var

    double radius; //instance var

    static int getCount(){
        return count;
    }

    double volume(){
        return 4.0*3.0*PI*radius*radius*radius;
    }
}
