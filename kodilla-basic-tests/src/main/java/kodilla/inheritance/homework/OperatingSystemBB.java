package kodilla.inheritance.homework;

public class OperatingSystemBB extends OperatingSystem {
    public OperatingSystemBB(int year) {
        super(year);
    }

    public void TurnOn() {
        System.out.println("Operating System turned on 2023");
    }

    @Override
    public void TurnOn() {
    public OperatingSystemBB(int year) {
        super(year);
        System.out.println("Operating System turned on 2022");
        }
    }
}
