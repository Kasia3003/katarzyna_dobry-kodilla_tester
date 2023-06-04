package basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 2;
        int d = 2;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb" + a + "i" + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb" + a + "i" + b);
        }
        int subtrackResult = calculator.subtract(a, b);
        correct = ResultChecker.assertEquals(2, subtrackResult);
        if (correct) {
            System.out.println("Metoda subtrack działa poprawnie dla liczb" + a + "i" + b);
        } else {
            System.out.println("Metoda subtrack nie działa poprawnie dla liczb" + a + "i" + b);
        }
        double powResult = calculator.pow(c);
        correct = ResultChecker.assertEquals(4, 3); {
            if (correct) {
                System.out.println("Metoda pow działa dla liczby 2" );
            } else {
                System.out.println("Metoda pow nie działa dla liczby 2" );
            }
        }
    }
}
