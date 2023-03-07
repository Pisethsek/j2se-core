package classes.person;

public class Person {
    //class variable or static var caused we don't need obj to access it
    static int val;

    //instance variable
    int id;
    String name;
    String gender;
    String address;
    int age;

    //constructor
    Person(){
//        name = "Unknown";
//        age = 10;
        System.out.println("This is no parameter");
    }
    Person(String name){
        this();
    }

    Person(int id , String name, String gender, String address, int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address =address;
        this.age =age;
    }

    void printIfo(){
        System.out.println("ID" +"\t"+ "Name" +"\t"+ "Gender" +"\t"+ "Address" +"\t"+ "Age");
        System.out.println(id +"\t"+ name +"\t"+ gender +"\t"+ address +"\t"+ age);
    }

}
