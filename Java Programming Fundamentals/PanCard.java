import java.util.Scanner;
import java.util.regex.*;

public class PanCard{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the PAN no:");
        String pan = s.next();
        s.close();
        if(pan == null){
            System.out.println("Invalid PAN no");
            System.exit(0);
        }
        else{
            String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(pan);
            if(m.matches()){
                System.out.println("Valid PAN no");
            }
            else System.out.println("Invalid PAN no");
        }
    }
}