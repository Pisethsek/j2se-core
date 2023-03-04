package control_statement;

public class Intro {
    public static void main(String[] args) {
        //flow control divide to 3 parts :
        //selection, iteration, jump
        /*
        * 1. selection
        *       if, if/else, if/else if, switch
        * 2. iteration
        *       for, while, do-while
        * 3. jump
        *       break, continue, return
        *
        *
        *
        * */

        enum Seasons{spring, khmer}
        Seasons seasons = Seasons.khmer;

        System.out.println(seasons);
    }
}
