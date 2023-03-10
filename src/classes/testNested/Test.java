package classes.testNested;

public class Test {

    class People{

        class Human {

            class Man{
                void welcome(){
                    System.out.println("Hello");
                }
            }
        }
    }


    public static void main(String[] args) {
        Test t = new Test();
        Test.People t1 = t.new People();

        People.Human t2 = t1.new Human();



    }
}
