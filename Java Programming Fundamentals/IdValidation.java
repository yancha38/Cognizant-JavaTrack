import java.util.Scanner;

public class IdValidation{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your ID");
        String id = s.nextLine();
        s.close();
        
        boolean flag = false;
        if(id.length() == 12){
        for(int i = 0; i < id.length(); i++){
            if(id.substring(0, 3).contains("GBL")){
                flag = true;
            }
        }
    }
        if(flag){
            System.out.println("Login success");
        }
        else System.out.println("Incorrect ID");
    }
}
