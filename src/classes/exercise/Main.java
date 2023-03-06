package classes.exercise;

public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker();
        worker.name = "Seth";
        worker.gender = "M";
        worker.age = 21;
        worker.totalHour = 12;
        worker.wage = 12.4f;

        worker.info();

    }
}
