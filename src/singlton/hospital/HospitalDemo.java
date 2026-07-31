package singlton.hospital;

public class HospitalDemo {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();

        logger1.log("Doctor James Mugabo logged in");


        Logger logger2 = Logger.getInstance();

        logger2.log("Patient Jane Mutoni checked in");


        System.out.println(logger1);
        System.out.println(logger2);


        System.out.println(logger1 == logger2);
    }
}