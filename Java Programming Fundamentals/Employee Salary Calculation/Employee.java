public class Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    
    public void calculateNetSalary(int pfpercentage) {
        double pfAmount = 0, nSalary = 0;
        double sal = getSalary();
        pfAmount = (sal * pfpercentage) / 100;
        nSalary = sal - pfAmount;
        setNetSalary(nSalary);
        System.out.println("Id : " + getEmployeeId());
        System.out.println("Name : " + getEmployeeName());
        System.out.println("Salary : " + getSalary());
        System.out.println("Net Salary : " + getNetSalary());
    }
}
