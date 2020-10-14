import java.util.Scanner;

public class PrimeNumbers{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        int l = s.nextInt();
        int h = s.nextInt();
        if(l <= 0 || h <= 0 || (h - l) < 0 || h == l){
            System.out.println("Provide valid input");
        }
        else{
            while(l > 0 && h > 0 && h >= l){
                int flag = 0;
                for(int i = 2; i < l; i++){
                    if(l % i == 0){
                        flag = 1;
                        break;
                    }
                }
                if(flag != 1 && l != 0 && l != 1){
                    System.out.print(l + " ");
                }
                ++l;
            }
        }
    }
}
