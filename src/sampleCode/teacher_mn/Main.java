package sampleCode.teacher_mn;

import sampleCode.stuent_mn.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        List<Teacher> arr = new ArrayList<>();
        Teacher teacher = new Teacher();

        int choose;
        do {
            choose = Teacher.menu();

            switch (choose){
                case 1 -> {
                    System.out.print("Enter number of teacher to add : ");
                    int num = cin.nextInt();
                    boolean isTrue = teacher.add(arr,num);
                    if (isTrue){
                        System.out.println("Add Success");
                    }else {
                        System.out.println("Add Failed");
                    }
                }
                case 2 -> {
                    teacher.list(arr);
                }
                case 3 -> {
                    System.out.print("Enter id to edit : ");
                    int id = cin.nextInt();
                    teacher.update(arr, id);
                }
                case 4 -> {
                    System.out.print("Enter id to delete : ");
                    int id = cin.nextInt();
                    teacher.delete(arr, id);
                }
                case 0 -> {}

                default -> System.out.println("Invalid chosen!!!!");
            }
        }while (choose!=0);

    }
}
