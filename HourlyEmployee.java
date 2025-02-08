public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyWage) {// done
        super(name);
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) { // done
        this.hoursWorked = hoursWorked;
    }

    public double calcPrebonusPay() { // done
        return hourlyWage * hoursWorked;
    }

    public String getJobCode() { // done
        return "HRLY";
    }

}
