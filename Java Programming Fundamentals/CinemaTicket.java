import java.util.Scanner;

public class CinemaTicket{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        double cost = 0.0;
        System.out.println("Enter the no of ticket:");
        int tk = s.nextInt();
        if(tk >= 5 && tk <= 40){
            System.out.println("Do you want refreshment:");
            char ref = s.next().charAt(0);
            System.out.println("Do you have coupon code:");
            char cou = s.next().charAt(0);
            System.out.println("Enter the circle:");
            char cir = s.next().charAt(0);
            if(cir == 'k' || cir == 'q'){
                if(cir == 'k'){
                    double m = (double)tk;
                    cost = (75 * m);
                    if(tk > 20){
                        cost = cost - (75 * m * 0.1);
                    }
                }
                else if(cir == 'q'){
                    double m = (double)tk;
                    cost = (150 * m);
                    if(tk > 20){
                        cost = cost - (150 * m * 0.1);
                    }
                }
            }
            else{
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(cou == 'y'){
                cost = cost - (cost * 0.02);
            }
            if(ref == 'y'){
                double ticket = (double)tk;
                cost = cost + (50 * ticket);
            }
            System.out.print("Ticket cost:");
            System.out.printf("%.2f", cost);
        }
        else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}