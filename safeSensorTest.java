package src.CHAPTER7;

public class safeSensorTest {
    public static void main(String[] args) {
        //create SafeSensor with one parameter  constructor;
        SafeSensor safeSensor1 = new SafeSensor(20);
        System.out.println(safeSensor1);

        //create SafeSensor with two parameters constructor;
        SafeSensor safeSensor2 = new SafeSensor(30,20);
        System.out.println(safeSensor2);

        safeSensor2.setPressure(-10);

        safeSensor2.setPressure(40);

        safeSensor2.setPressure(25);
        System.out.println(safeSensor2);


    }

}




