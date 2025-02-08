public class CommissionEmployee extends Employee {

    private double commissionRate;
    private double sales;

    public CommissionEmployee(String name, double commissionRate) { // done
        super(name);
        this.commissionRate = commissionRate;
    }

    public void setSales(double sales) { // done
        this.sales = sales;
    }

    public double calcPrebonusPay() { // done
        return sales * commissionRate;
    }

    public String getJobCode() { // done
        return "COMM";
    }

}
