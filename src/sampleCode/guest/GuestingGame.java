package sampleCode.guest;

import java.util.Scanner;

public class GuestingGame {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter Your Name Here : ");
        String name = cin.nextLine();

        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            int result = switch (name.charAt(i)) {
                case 'a', 'j', 's' -> 1;
                case 'b', 'k', 't' -> 2;
                case 'c', 'l', 'u' -> 3;
                case 'd', 'm', 'v' -> 4;
                case 'e', 'n', 'w' -> 5;
                case 'f', 'o', 'x' -> 6;
                case 'g', 'p', 'y' -> 7;
                case 'h', 'q', 'z' -> 8;
                case 'i', 'r' -> 9;
                default -> 0;
            };
            sum += result;
        }

        System.out.println("Before : "+sum);
        System.out.println("-----------");

        if (sum>9){
            while (!(sum <=9)){
                String data = String.valueOf(sum);
                int[] arr = new int[data.length()];
                for (int i=0; i<data.length(); i++){
                    arr[i] = Integer.parseInt(String.valueOf(data.charAt(i)));
                }
                sum = 0;
                for (int i:arr)
                    sum += i;
            }
        }

        System.out.println("--------------------------");
        System.out.println("Sum of your name is : "+ sum);
    }
}
