package kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2023);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println(operatingSystem.getYear());
        OperatingSystemAA operatingSystemAA = new OperatingSystemAA(2021);
        operatingSystemAA.turnOn();
        operatingSystemAA.turnOff();
        System.out.println(operatingSystemAA.getYear());
        OperatingSystemBB operatingSystemBB = new OperatingSystemBB(2022);
        operatingSystemBB.turnOn();
        operatingSystemBB.turnOff();
        System.out.println(operatingSystemBB.getYear());
    }
}
