public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
        double loan = 0.0;

        if (employeeObj instanceof PermanentEmployee) {
            loan = employeeObj.getSalary() * 15.0 / 100.0;
        } else if (employeeObj instanceof TemporaryEmployee) {
            loan = employeeObj.getSalary() * 10.0 / 100.0;
        }

        return loan;
	}

}
