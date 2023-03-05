package classes.demo;

class People {
    int id;
    String name;
    People(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class Intro {
    public static void main(String[] args) {
        People p1 = new People(1001, "Lao");
        System.out.println(p1.id);
        System.out.println(p1.name);
    }
}
