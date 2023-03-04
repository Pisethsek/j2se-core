package operator;

public class Logical {

    public static void main(String[] args) {
        int a = 12;
        int b = 14;

        System.out.println(a > 1 && b > a);
        System.out.println(a > 1 || b > a);
        System.out.println(a > 1 != b > a);
    }
}
