public abstract class Employee implements PayableEntity {

    private static int numEmployees = 0;
    private String name;
    private double bonus;

    public Employee(String name) { // done
        numEmployees++;
        this.name = name;
    }

    public abstract double calcPrebonusPay();

    public abstract String getJobCode();

    public static int getNumEmployees() {// done
        return numEmployees;
    }

    public double calcTotalPay() { // done
        return calcPrebonusPay() + getBonus();
    }

    public double amountOwed() { // done
        return calcTotalPay();
    }

    public String getName() {// done
        return name;
    }

    public double getBonus() {// done
        return bonus;
    }

    public void setBonus(double bonus) { // done
        this.bonus = bonus;
    }

    public String toString() { // done
        String ret = String.format("%-15s %-4s $%8.2f $%8.2f", name, getJobCode(), calcPrebonusPay(), calcTotalPay());
        return ret;
    }
}
