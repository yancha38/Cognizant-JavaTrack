import java.util.Scanner;

public class Season{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
    
        System.out.println("Enter the month:");
        int month = s.nextInt();
        s.close();
    
        if(month >0 && month < 13){
            if(month >= 3 && month <= 5){
                System.out.println("Season:Spring");
            }
            else if(month >= 6 && month <= 8){
                System.out.println("Season:Summer");
            }
            else if(month >= 9 && month <= 11){
                System.out.println("Season:Autumn");
            }
            else{
                System.out.println("Season:Winter");
            }
        }
        else{
            System.out.println("Invalid month");
            System.exit(1);
        }
    }
}
