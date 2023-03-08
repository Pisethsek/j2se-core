package pattern.mvc;

import pattern.mvc.controller.StudentController;
import pattern.mvc.model.Student;
import pattern.mvc.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {

        Student model = retriveStudentFromDatabase();

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

    }

    private static Student retriveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
