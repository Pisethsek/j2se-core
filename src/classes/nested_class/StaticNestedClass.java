package classes.nested_class;

public class StaticNestedClass {

    static int a = 12;

    static class Option{
        static void printValue(){
            System.out.println("The Value of a is : "+a);
        }
        static int sumValue(int a, int b){
            return a +b;
        }
    }

    public static void main(String[] args) {
//        StaticNestedClass.Option obj = new StaticNestedClass.Option();
//        obj.printValue();
        StaticNestedClass.Option.printValue();
        int a = StaticNestedClass.Option.sumValue(12,3);
        System.out.println(a);


    }
}
