package kodilla.inheritance.homework;

public class OperatingSystemAA extends OperatingSystem {
    public OperatingSystemAA(int year) {
        super(year);
    }

    public void turnoff() {
        System.out.println("Operating System turned on 2021");
    }

    @Override
    public void turnoff() {
    public OperatingSystemAA(int year) {
        super(year);
        System.out.println("Operating System turned on 2020");
        }
    }
}

