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
        if (hoursWorked > 40) {
            return (40 * hourlyWage) + ((hoursWorked - 40) * (hourlyWage * 1.5));
        } else {
            return hoursWorked * hourlyWage;
        }
    }

    public String getJobCode() { // done
        return "HRLY";
    }

}
