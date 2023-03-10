package classes.testNested;

public class LocalInnerClass {

    int id;
    String name;

    int age;

    void getInfo(int a, int b){
        class People{
            int age;

            void display(){
                System.out.println("Display is "+(a+b));
                System.out.println(id+name+age);
            }
        }
        People p = new People();
        p.display();
    }

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.getInfo(20,30);
    }
}
