package classes.co;

public class Worker {
    public String gender;
    public String name;
    public int age;
    public float salary;

    public Worker(){
        System.out.println("Default constructor of worker");
    }

    public Worker(String name, String gender, int age, float salary){
        this.name = name;
        this.gender = gender;
        this.age =age;
        this.salary = salary;
    }
}

