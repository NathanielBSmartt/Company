public class LimitedCommissionEmployee extends CommissionEmployee { // done

    private double basePay;

    public LimitedCommissionEmployee(String name, double commissionRate, double basePay) { // done
        super(name, commissionRate);
        this.basePay = basePay;
    }

    public double calcPrebonusPay() {// done
        if (super.calcPrebonusPay() >= basePay && super.calcPrebonusPay() <= basePay * 2) {
            return super.calcPrebonusPay();
        } else if (super.calcPrebonusPay() > basePay * 2) {
            return basePay * 2;
        } else {
            return basePay;
        }
    }

    public String getJobCode() { // done
        return "LCOM";
    }

}
