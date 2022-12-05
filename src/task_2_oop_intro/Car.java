package task_2_oop_intro;

public class Car {


    public static void start() {
        startElectricity();
        startFuelSystem();
        startCommand();
    }


    private static void startElectricity() {
        System.out.println("Electricity is turned on");
    }

    private static void startCommand() {
        System.out.println("The engine is started");
    }

    private static void startFuelSystem() {
        System.out.println("The fuel system is activated");
    }

}
