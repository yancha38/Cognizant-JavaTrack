import java.util.Scanner;

public class Main{
    
    public static Employee getEmployeeDetails() {
        Employee emp = null;
        try {
            emp = new Employee();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Id:");
            emp.setEmployeeId(s.nextInt());
            System.out.println("Enter Name:");
            emp.setEmployeeName(s.next());
            System.out.println("Enter salary:");
            emp.setSalary(s.nextDouble());
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return emp;
    }
    
    public static int getPFPercentage() {
        int pf = 0;
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter PF percentage:");
            pf = s.nextInt();
            s.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return pf;
    }
    
    public static void main (String[] args) {
        Employee em = getEmployeeDetails();
        int pdf = getPFPercentage();
        em.calculateNetSalary(pdf);
    }
}
