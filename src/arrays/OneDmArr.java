package arrays;

import java.util.Arrays;

public class OneDmArr {
    public static void main(String[] args) {
        //declare array
        int[] arr;
        //initialization arr
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        //for loop with array one dm
        for (int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }

        //for each
        for (int i:arr2)
            System.out.println(i);

        //Arrays
        System.out.println(Arrays.stream(arr2));

        //access element in array
        System.out.println(arr2[0]);


        //determine size of arr when create it
        String[] student = new String[3];
        System.out.println("Student arr has "+student.length+((student.length>1) ? "s":""));
        System.out.println("------------------------");

        //utility method
        Arrays.fill(student,"Sek Piseth");
        Arrays.fill(student,"Sek Piseth2");
        for(String i:student)
            System.out.println(i);

        //reference array
        System.out.println("--------------------");
        int[] cam = {1,2,3,4,5};
        int[] temp = cam;
        temp = new int[]{10, 20};

        for (int i : temp)
            System.out.println(i);

    }
}
