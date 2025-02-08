public class Company {

    private String name;
    private Employee[] employees;
    private Utility[] utilities;
    private int employeeIndex = 0;
    private int utilityIndex = 0;

    public Company(String name, int numEmployees, int numUtilities) { // done
        this.name = name;
        employees = new Employee[numEmployees];
        utilities = new Utility[numUtilities];
    }

    public String getName() { // done
        return name;
    }

    public void addEmployee(Employee e) { // done
        employees[employeeIndex] = e;
        employeeIndex++;
    }

    public void addUtility(Utility u) { // done
        utilities[utilityIndex] = u;
        utilityIndex++;
    }

    public String createPayrollListing() { // done
        String ret = String.format("%s Payroll\n%-15s %-5s %8s %8s\n", name, "Name", "Code", "Pay", "Total Pay");

        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            ret = ret + employees[i].toString() + "\n";
        }

        return ret;
    }

    public String createUtilityListing() { // done
        String ret = String.format("%s Utilities\n%-20s %10s\n", name, "Name", "Bill Amount");

        for (int i = 0; i < utilities.length; i++) {
            if (utilities[i] == null) {
                continue;
            }
            ret = ret + utilities[i].toString() + "\n";
        }

        return ret;
    }

    public double calcTotalExpenditures() { // done
        return calcExpenditure(employees) + calcExpenditure(utilities);
    }

    private double calcExpenditure(PayableEntity[] entities) { // done
        double total = 0;

        for (int i = 0; i < entities.length; i++) {
            if (entities[i] == null) {
                continue;
            }
            total += entities[i].amountOwed();
        }

        return total;
    }

}
