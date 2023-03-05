package arrays;

public class MultiDm {
    public static void main(String[] args) {
        //declare array of array
        //2dm arr
        int[][] arr = new int[2][4];

        int[][] arr2 = new int[][]{
                {1,2,3,4,5},
                {10,20,30,50}
        };

        for (int i=0; i<arr2.length; i++){
            for (int j=0; j<arr2[i].length; j++){
                System.out.println("a["+i+"]["+j+"]="+arr2[i][j]);
            }
        }

        for (int[] i : arr2){
            for (int data : i){
                System.out.println(data);
            }
        }

        System.out.println("---------------");

        char[] letters = {'A', 'B', 'C'};
        for (int i=0; i<letters.length; i++){
            System.out.println(letters[i]);
        }

        //string
        String num = "123451";
        int sum = 0;
        for (int i=0; i<num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(sum);
        System.out.println("String start with "+ num.startsWith("1"));
        System.out.println("String end with "+num.endsWith("4"));
        System.out.println("Index of "+num.indexOf('3'));


    }
}
