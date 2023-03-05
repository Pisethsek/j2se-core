package classes.class_obj;

public class MainPeople {
    public static void main(String[] args) {
        People student = new People();
        student.id = 1001;
        student.name = "Sek Piseth";
        student.age = 21;
        student.address = "PP";

        student.stays();
    }
}
