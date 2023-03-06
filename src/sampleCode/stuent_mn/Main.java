package sampleCode.stuent_mn;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Student student = new Student();
        Student[] arr = new Student[0];

        int choose;
        do {
           choose = Student.menu();

           switch (choose){
               case 1 -> {
                   System.out.print("Enter number student to insert : ");
                   int n = cin.nextInt();
                   arr = new Student[n];
                   for (int i=0 ; i<arr.length; i++){
                       arr[i] = new Student();
                       arr[i].input();
                   }
               }
               case 2 -> {
                    student.show(arr);
               }
               case 3 -> {
                   System.out.print("Enter id to edit : ");
                   int id = cin.nextInt();
                   student.edit(arr, id);
               }
               case 4 -> {
                   System.out.print("Enter id to delete : ");
                   int id = cin.nextInt();
                   student.delete(arr, id);
               }
               case 0 -> {

               }

               default -> System.out.println("Invalid chosen!!!!");
           }
        }while (choose!=0);

    }
}
