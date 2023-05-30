package kodilla.inheritance.homework;

public class OperatingSystemBB extends OperatingSystem {


    public OperatingSystemBB(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Bla, bla");
    }

    @Override
    public void turnOff() {
        System.out.println("Operating System turned on 2022");
    }
}
