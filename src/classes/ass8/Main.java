package classes.ass8;

public class Main {
    public static void main(String[] args) {

        Anonymous obj = new AnExtend();
        obj.printData();
        Anonymous obj5 = new Anonymous() {
            @Override
            void printData() {

            }
        };

        Anonymous obj6 = new Anonymous() {
            @Override
            void printData() {

            }
        };
//        obj4.data();
//
//        Anonymous obj = new Anonymous() {
//            @Override
//            void printData() {
//                System.out.println("Hello");
//            }
//        };
////        obj.printData();
//
//
//        Anonymous obj2 = new Anonymous() {
//            @Override
//            void printData() {
//                System.out.println("hello2");
//            }
//
//            @Override
//            void data() {
//                System.out.println("Hell03");
//            }
//        };
//
//        obj2.printData();
//        obj2.data();
    }
}
