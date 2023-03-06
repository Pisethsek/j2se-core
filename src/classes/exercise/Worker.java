package classes.exercise;

import java.text.DecimalFormat;

public class Worker {
    String name;
    int age;
    String gender;
    float wage;
    int totalHour;

    public float getSal(){
        return this.totalHour * this.wage;
    }

    public void info(){
        DecimalFormat df = new DecimalFormat("$##, ##0.00");
        System.out.println("Name : "+this.name);
        System.out.println("Age  : "+this.age);
        System.out.println("Gender : "+this.gender);
        System.out.println("Wage   : "+this.wage);
        System.out.println("Total  : "+this.totalHour);
        System.out.println("Salary\t\t: "+df.format(getSal()));
    }

}
