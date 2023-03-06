package sampleCode.stuent_mn;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    int age;

    Student(){}
    Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void input(){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Id   : ");
        this.id = cin.nextInt();
        System.out.print("Enter Name : ");
        cin.nextLine();
        this.name = cin.nextLine();
        System.out.print("Enter Age  : ");
        this.age = cin.nextInt();
    }

    void info(){
        System.out.println("-----------------");
        System.out.println("Id   : "+this.id);
        System.out.println("Name : "+this.name);
        System.out.println("Age  : "+this.age);
        System.out.println("-----------------");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    static int menu(){
        Scanner cin = new Scanner(System.in);
        System.out.println("1. Insert student");
        System.out.println("2. Show all student");
        System.out.println("3. Edit student");
        System.out.println("4. Delete student");
        System.out.println("0. Exit");
        System.out.print("Choose :: ");
        int ch = cin.nextInt();
        System.out.println("-----------------");
        return ch;
    }

    public void show(Student[] arr){
        for (Student i : arr)
            System.out.println(i);
    }
    public boolean edit(Student[] arr, int id){
        boolean is = false;
        for (int i=0; i<arr.length; i++){
            if (arr[i].id == id){
                arr[i].input();
                is = true;
            }
        }

        if (is){
            System.out.println("Updated");
            return true;
        }else {
            System.out.println("Not found");
            return false;
        }
    }

    public boolean delete(Student[] arr, int id){
        boolean is = false;

        int n = arr.length;
        for (int i=0; i<n; i++){
            if (arr[i].id == id){
                is = true;
                for (int j=i; j<n-1; j++){
                    arr[j] = arr[j+1];
                }
                n--;
            }
        }

        if (is){
            System.out.println("Deleted");
            return true;
        }else {
            System.out.println("Not found");
            return false;
        }

    }


}
