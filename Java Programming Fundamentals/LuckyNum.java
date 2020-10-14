import java.util.Scanner;

public class LuckyNum{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the car no:");
        int num = s.nextInt();
        s.close();
        
        if(num >= 1000 && num <= 9999){
            int temp = num, sum = 0;
            while(temp != 0){
                int rem = temp % 10;
                sum += rem;
                temp = temp / 10;
            }
            if(sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0){
                System.out.println("Lucky Number");
            }
            else{
                System.out.println("Sorry its not my lucky number");
                System.exit(0);
            }
        }
        else{
            System.out.println(num + " is not a valid car number");
            System.exit(0);
        }
    }
}
