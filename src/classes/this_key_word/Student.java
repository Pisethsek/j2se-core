package classes.this_key_word;
/*
this keyword is used to refer to the current object, i.e. through which the method is called.
this() is used to call one constructor from the other of the same class.
*/

public class Student {
    private int id;
    private String name;
    public Student(){
        this(1009, "def");
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id = id;

    }
    public static void main(String[] args) {
        Student student = new Student();
//        student.setName("Seth");
        System.out.println(student.getName());
        System.out.println(student.getId());
    }
}
