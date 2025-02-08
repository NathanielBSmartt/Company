public class SalariedEmployee extends Employee {

    private double weeklyPay;

    public SalariedEmployee(String name, double weeklyPay) {// done
        super(name);
        this.weeklyPay = weeklyPay;
    }

    public double calcPrebonusPay() { // done
        return weeklyPay;
    }

    public String getJobCode() { // done
        return "SLRY";
    }

}
