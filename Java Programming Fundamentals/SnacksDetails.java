import java.util.Scanner;

public class SnacksDetails{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the no of pizzas bought:");
        int p = s.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int f = s.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int c = s.nextInt();
        s.close();
        int totalBill = (p * 100) + (f * 20) + (c * 10);
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + p);
        System.out.println("No of puffs:" + f);
        System.out.println("No of cooldrinks:" + c);
        System.out.println("Total price=" + totalBill + "\nENJOY THE SHOW!!!");
    }
}