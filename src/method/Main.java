package method;

public class Main {
    public static void main(String[] args) {

        Function.greeting();

        float money = Function.findSalary();
        System.out.println("Salary is : "+money);

        Function.greeting("Piseth");

        float moneyII = Function.findSalary(12,4.5f);
        System.out.println("Salary is : "+moneyII);

//        Function.speak();

        int sum = 0;
        for (int i=1; i<=5; i++){
            sum += i;
        }
        System.out.println(sum);

        int res = Function.sumValue(5);
        System.out.println(res);

    }
}
