import java.util.Scanner;

public class IncrementCalculation{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the salary");
        int sal = s.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        double app = s.nextDouble();
        s.close();
        
        if(sal <= 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else{
            double increment = 0;
            if(app >= 1 && app <= 3){
                increment = (sal + (sal * 0.10));
                System.out.println((int)increment);
            }
            else if(app >= 3.1 && app <= 4){
                increment = (sal + (sal * 0.25));
                System.out.println((int)increment);
            }
            else if(app >= 4.1 && app <= 5){
                increment = (sal + (sal * 0.30));
                System.out.println((int)increment);
            }
            else{
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
    }
}