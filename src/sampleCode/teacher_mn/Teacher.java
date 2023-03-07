package sampleCode.teacher_mn;

import sampleCode.stuent_mn.Student;

import java.util.List;
import java.util.Scanner;

public class Teacher extends Student {
    Teacher(){}

   public Teacher(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age =age;
   }

    public boolean add(List<Teacher> arr, int num){
        Teacher obj;
        for (int i=0; i<num; i++){
            obj = new Teacher();
            obj.input();
            arr.add(obj);
        }

        if (arr.size() > 0){
            return true;
        }else {
            return false;
        }

    }

    public void list(List<Teacher> arr){
        for (Teacher i:arr)
            System.out.println(i);
    }

    public void update(List<Teacher> arr, int id){
        Scanner cin = new Scanner(System.in);
        boolean isFound = false;
        int count =0;
        for (Teacher i : arr){
            count ++;
            if (i.id == id){
                isFound = true;
                System.out.print("Enter new name : ");
                this.name = cin.nextLine();
                System.out.print("Enter new age   : ");
                this.age = cin.nextInt();
                arr.set(count-1, new Teacher(i.id, name, age));
            }
        }

        if (isFound){
            System.out.println("Successful");
        }else {
            System.out.println("Cannot Update");
        }
    }

    public void delete(List<Teacher> arr, int id){
        boolean isFound = false;

        for (int i=0; i<arr.size(); i++){
            if (arr.get(i).id == id){
                Teacher t = arr.get(i);
                arr.remove(t);
                isFound = true;
            }
        }

        if (isFound){
            System.out.println("Successful");
        }else {
            System.out.println("Cannot Delete");
        }
    }



}
