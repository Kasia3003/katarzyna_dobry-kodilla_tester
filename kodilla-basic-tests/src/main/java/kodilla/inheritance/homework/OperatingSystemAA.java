package kodilla.inheritance.homework;

public class OperatingSystemAA extends OperatingSystem {


    public OperatingSystemAA(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
       System.out.println("Bla");
    }

    @Override
    public void turnOff() {
        System.out.println("Bla");
    }
}

