public class LimitedCommissionEmployee extends CommissionEmployee {

    private double basePay;

    public LimitedCommissionEmployee(String name, double commissionRate, double basePay) { // done
        super(name, commissionRate);
        this.basePay = basePay;
    }

    public double calcPrebonusPay() {// done
        return basePay;
    }

    public String getJobCode() { // done
        return "LCOM";
    }

}
