package homework.bank;

public class CashMachine {
    private double[] amounts;
    private int size;

    public CashMachine() {
        this.amounts = new double[0];
        this.size = 0;
    }

    public void subtrack(int cashOut) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(amounts, 0, newTab, 0, amounts.length);
        newTab[this.size - 1] = cashOut;
        this.amounts = newTab;
    }

    public double[] getCashOut() {
        return amounts;
    }

    public void add(int cashIn) {
        this.size++;
        double[] newTab = new double[this.size];
        System.arraycopy(amounts, 0, newTab, 0, amounts.length);
        newTab[this.size - 1] = cashIn;
        this.amounts = newTab;
    }

    public double[] getCashIn() {
        return amounts;
    }

    public double getSummary() {
        if (this.amounts.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.amounts.length; i++) {
            sum += this.amounts[i];
        }
        return sum;
    }
    public double getAverage() {
        if (this.amounts.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.amounts.length; i++) {
            sum += this.amounts[i];
        }
        return sum/this.amounts.length;
    }
}
