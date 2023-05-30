package kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year; }

    public void turnOn() {
        System.out.println("Operating System turned on 2023");
    }

    public void turnOff() {
        System.out.println("Operating System turned on 2023");
    }
    public int getYear() {
        return year;
    }
    public void displayYearOfSystem() {
        System.out.println("Year Of System: " + year);
    }
}
