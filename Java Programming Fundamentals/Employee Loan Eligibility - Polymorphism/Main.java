import java.util.Scanner;

public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        PermanentEmployee pm = new PermanentEmployee(10, "Chayan", 100000);
        TemporaryEmployee tm = new TemporaryEmployee(11, "Arnab", 6, 100);

        Loan lo = new Loan();
        double permanentEmployeeLoan = lo.calculateLoanAmount(pm);
        double temporaryEmployeeLoan = lo.calculateLoanAmount(tm);

        System.out.println(permanentEmployeeLoan);
        System.out.println(temporaryEmployeeLoan);
    }
    
}
