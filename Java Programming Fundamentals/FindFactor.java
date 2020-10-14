import java.util.Scanner;

public class FindFactor{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        if(num == 0){
            System.out.println("No Factors");
        }
        else{
            for(int i = 1; i <= Math.abs(num); i++){
                if((num) % i  == 0){
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
