package classes.testNested;

public class Testing {
    public static void main(String[] args) {
        Person obj = new Person() {
            @Override
            public float getSal() {
                return wage*hour;
            }
        };
        obj.name = "Seth";
        obj.gender = "Male";
        obj.hour = 100f;
        obj.wage = 10f;

        float sal =0 ;
        if (obj.getSal() >=1000){
            if(obj.gender == "Male"){
                sal = (float) (obj.getSal() - obj.getSal()*0.3);
            }else {
                sal = (float) (obj.getSal() - obj.getSal()*0.10);
            }
        }else {
            sal = obj.getSal();
        }

        System.out.println(sal);



    }
}
