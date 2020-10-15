import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PasswordGeneration{
    
    public static boolean isValid(String password){
        String re = "^(?=.*[a-z])(?=.*[0-9])(?=.*[A-Z])(?=.*[@#*]).{8,20}$";
        Pattern p = Pattern.compile(re);
        Matcher m = p.matcher(password);
        return m.matches();
    }
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Generate your Security Code");
        String code = s.next();
        s.close();
        
        if(isValid(code)){
            System.out.println("Security Code Generated Successfully");
        }
        else System.out.println("Invalid Security Code, Try Again!");
    }
}