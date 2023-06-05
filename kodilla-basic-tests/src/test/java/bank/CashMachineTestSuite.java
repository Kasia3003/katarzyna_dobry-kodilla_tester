package bank;

import homework.bank.CashMachine;
import org.junit.jupiter.api.Test;
import school.Grades;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        double[] amounts = cashMachine.getCashOut();
        assertEquals(0, amounts.length);
    }

    public void shouldHaveZeroLengthCashIn() {
        CashMachine cashMachine = new CashMachine();
        double[] amounts = cashMachine.getCashIn();
        assertEquals(0, amounts.length);
    }

    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(1);
        cashMachine.add(2);
        double[] amounts = cashMachine.getCashIn();
        assertEquals(2, amounts.length);
        assertEquals(1, amounts[0]);
        assertEquals(2, amounts[1]);
    }

    public void shouldSubtrackOneElementFromArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.subtrack(1);
        double[] amounts = cashMachine.getCashOut();
        assertEquals(1, amounts.length);
        assertEquals(1, amounts[0]);
    }

    public void shouldReturnSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(600);
        cashMachine.subtrack(200);
        assertEquals(900, cashMachine.getSummary(), 0.01);
    }

    public void shouldReturnAverage() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(500);
        cashMachine.add(600);
        cashMachine.subtrack(200);
        assertEquals(300, cashMachine.getAverage(), 0.01);
    }
}
