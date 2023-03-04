package control_statement;

public class Selection {
    public static void main(String[] args) {
        int a = 50;
        int b = 200;

        //if
        if (a>100){
            System.out.println("Hello");
        }

        //if-else
        if (a<100){
            System.out.println("Hello a");
        }else {
            System.out.println("Hello "+b);
        }

        System.out.println("-----------");

        //if-else-if
        if (a<10){
            System.out.println("A");
        }else if(a<100){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
        System.out.println("------------");
        //example find grade student
        int score = 90;
        String res = "";

        if(score>50){
           if (score <= 70)
                res = "D";
            else if(score <= 80)
                res = "C";
            else if(score <= 90)
                res = "B";
            else if (score <=100)
                res = "A";
            else
               System.out.println("Wrong score!!!");
        } else if (score==50) {
            res = "E";
        } else {
            res = "Failed";
        }

        System.out.println(res);

        //switch
        int number = 44;
        String size;
        switch (number) {
            case 29:
                size = "Small";
                break;
            case 42:
                size = "Medium";
                break;
            // match the value of week
            case 44:
                size = "Large";
                break;
            case 48:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Size: " + size);
    }
}
