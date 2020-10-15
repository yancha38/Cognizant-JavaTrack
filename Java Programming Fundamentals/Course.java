import java.util.Scanner;

public class Course{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter no of course:");
        int num = s.nextInt();
        boolean flag = false;
        if(num <= 0){
            System.out.println("Invalid Range");
            System.exit(0);
        }
        else{
            System.out.println("Enter course names:");
            String[] cou = new String[num];
            for(int i = 0; i < num; i++){
                cou[i] = s.next();
            }
            System.out.println("Enter the course to be searched:");
            String d = s.next();
            for(int i = 0; i <= cou.length - 1; i++){
                if(d.contains(cou[i])){
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(d + " course is available");
            }
            else System.out.println(d + " course is not available");
        }
    }
}