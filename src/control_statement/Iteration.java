package control_statement;

public class Iteration {
    public static void main(String[] args) {
        //for
        for (int i=1; i<10; i++){
            System.out.println("Hi "+i);
        }

        //while
        int a = 0;
        while (a<=10){
            a ++;
            System.out.println("Hi "+a);
        }

        //do-while
        do {
            System.out.println("Hi ");
        }while (false);

        //nested for
        int[][] arr = new int[][]{
                {1,2,3,4,4},
                {10,20,3}
        };
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
        }

    }
}
