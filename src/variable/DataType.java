package variable;

public class DataType {
    public static void main(String[] args) {

        //8 data type in java
        byte a = 0;
        short b;
        int c;
        long d;
        char e;
        float f;
        double g;
        boolean h;

        System.out.println(Byte.SIZE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);

        System.out.println(h=true);
        System.out.println(h=false);

        //scope of java divide 2 parts : global and local
        if(a<0){
            int k = 2;
            System.out.println(k);
        }else {
            int j = 9;
            System.out.println(j);
        }

        //type casting -> auto, manually
        int number1 = 1000;
        long num = number1; //auto casting

        double number2 = 200.6;
        float num2 =(float) number2; //manually
        System.out.println(num2);




    }
}
