package classes.ano;

public class Main {
    public static void main(String[] args) {

        //anonymous inner class
        AbClass obj = new AbClass() {
            @Override
            void show() {
                System.out.println("Body Method");
            }
        };
        obj.show();
        


        //call to inner class
        AbClass obj2 = new Inner();
        obj2.show();
    }

    //inner class
    private static class Inner extends AbClass{
        @Override
        void show() {
            System.out.println("Inner Class");
        }
    }
}
