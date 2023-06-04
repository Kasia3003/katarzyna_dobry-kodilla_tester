package basic_assertion;

public class ResultChecker {
    int expected;
    int actual;

    public static boolean assertEquals(int expected, int actual) {
        return expected == actual;
    }
}
