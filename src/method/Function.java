package method;

import java.util.Scanner;

public class Function {

    //1. Function with no arguments and no return value
    public static void greeting() {
        System.out.println("Hello Java Class");
    }

    //2. Function with no arguments and a return value
    public static float findSalary() {
        float wage;
        float hours;
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter wage  : ");
        wage = cin.nextInt();
        System.out.print("Enter hours : ");
        hours = cin.nextInt();
        return wage * hours;
    }

    //3. Function with arguments and no return value
    public static void greeting(String title) {
        System.out.println("Hello " + title);
    }

    //4. Function with arguments and a return value
    public static float findSalary(float wage, float salary){
        return wage * salary;
    }

    //recursive function
    public static void speak(){
        System.out.println("hello");
        speak();
    }
    public static int sumValue(int n){
        if (n == 1){
            return 1;
        }else {
            return n + sumValue(n-1);
        }
    }

}
