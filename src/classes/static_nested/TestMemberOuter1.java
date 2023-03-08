package classes.static_nested;
class TestMemberOuter1{
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
       TestOuter1 t = new TestOuter1();
       TestOuter1.Inner in = t.new Inner();
        in.msg();
    }
}