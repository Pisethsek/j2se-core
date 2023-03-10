package classes.testNested;

import javax.sound.midi.MidiChannel;

public class MainDemo {


    static int id = 1002;


   private class P{
        void display(){
            System.out.println(id);
        }
    }

    public void detail(){
       P p = new P();
       p.display();
    }

    public P obj(){
       P p = new P();
       return p;
    }

//    public static void main(String[] args) {
//        MainDemo dm = new MainDemo();
//        MainDemo.P obj = dm.new P();
//        obj.display();
//    }
}
