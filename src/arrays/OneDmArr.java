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
    }
}
