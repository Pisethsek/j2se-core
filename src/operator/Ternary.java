package operator;

public class Ternary {
    public static void main(String[] args) {
        int a = 12;

        if (a>0){
            System.out.println("a is grater than 0");
        }else {
            System.out.println("a is negative");
        }

        //using ternary
        System.out.println((a<0) ? true : false);
    }
}
