public class Utility implements PayableEntity {

    private String name;
    private double usage;
    private double rate;
    private double base;

    public Utility(String name, double rate, double base) { // done
        this.name = name;
        this.rate = rate;
        this.base = base;
    }

    public void setUsage(double usage) { // done
        this.usage = usage;
    }

    public double amountOwed() { // done
        return (usage * rate) + base;
    }

    public String toString() { // done
        String ret = String.format("%-20s $%10.2f", name, amountOwed());
        return ret;
    }

}
