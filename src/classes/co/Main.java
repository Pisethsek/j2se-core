package classes.co;

class Student {
    int id;
    String name, gender;
    int age;
    float average;

    Student(){}

    Student(int id, String name, String gender, int age, float average){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.average = average;
    }

    void printInfo(){
        System.out.println("id \t name \t gender \t age \t average");
        System.out.println(id+"\t"+name+"\t"+gender+"\t"+age+"\t"+average);
    }
}
public class Main {
    public static void main(String[] args) {
        Student obj = new Student(1, "Sak Visal", "Female", 21, 50.6f);
        obj.printInfo();

    }
}
