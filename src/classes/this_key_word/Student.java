package classes.this_key_word;

public class Student {
    /*
    this keyword is used to refer to the current object, i.e. through which the method is called.
    this() is used to call one constructor from the other of the same class.
    */
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

    public static void main(String[] args) {
        Student student = new Student();
//        student.setName("Seth");
        System.out.println(student.getName());
    }
}
