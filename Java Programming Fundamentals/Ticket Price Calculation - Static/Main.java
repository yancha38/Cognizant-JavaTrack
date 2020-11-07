import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        Ticket tk = new Ticket();
        
        System.out.println("Enter no of bookings:");
        int book = s.nextInt();
        System.out.println("Enter the available tickets:");
        int avl = s.nextInt();
        tk.setAvailableTickets(avl);
        for(int i = 0; i <= book; i++){
            System.out.println("Enter the ticketid:");
            int id = s.nextInt();
            tk.setTicketid(id);
            
            System.out.println("Enter the price:");
            int price = s.nextInt();
            tk.setPrice(price);
            
            System.out.println("Enter the no of tickets:");
            int no = s.nextInt();
            
            int totalAmt = 0;
            System.out.println("Available tickets:" + tk.getAvailableTickets());
            totalAmt = tk.calculateTicketCost(no);
            if(totalAmt != -1){
                System.out.println("Total amount:" + totalAmt);
                System.out.println("Available ticket after booking:" + tk.getAvailableTickets());
            }
        }
        s.close();
    }
}
