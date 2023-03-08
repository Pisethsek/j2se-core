package classes.demo_nested_class;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        Interface obj = (a, b) -> a + b;

        int sum = obj.sum(100,300);
        System.out.println("Sum is : "+sum);

    }
}
