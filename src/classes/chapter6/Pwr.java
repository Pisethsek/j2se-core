package classes.chapter6;

public class Pwr {
    double b;
    int e;
    double val;
    Pwr(double base, int exp){
        b = base;
        e = exp;
        val = 1;
        if (exp==0)return;
    }
}
