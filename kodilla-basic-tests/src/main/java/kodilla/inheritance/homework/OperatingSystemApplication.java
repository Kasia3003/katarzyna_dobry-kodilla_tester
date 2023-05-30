package kodilla.inheritance.homework;

public class OperatingSystemApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2023);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println(operatingSystem.getYear());
        OperatingSystemAA operatingSystemAA = new OperatingSystemAA(2021);
        operatingSystemAA.turnOff();
        System.out.println(operatingSystemAA.getYear());
    }
}
