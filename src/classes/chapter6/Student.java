package classes.chapter6;

public class Student {
    int id;
    String name;

    Student(){
        this(0, "FillName");
    }

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

}
