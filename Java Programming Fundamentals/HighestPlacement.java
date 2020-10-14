import java.util.Scanner;

public class HighestPlacement{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the no of students placed in CSE:");
        int cs = s.nextInt();
        System.out.println("Enter the no of students placed in ECE:");
        int ec = s.nextInt();
        System.out.println("Enter the no of students placed in MECH:");
        int me = s.nextInt();
        s.close();
        
        if(cs < 0 || ec < 0 || me < 0){
            System.out.println("Input is Invalid");
            System.exit(1);
        }
        else if(cs == 0 && ec == 0 && me == 0){
            System.out.println("None of the department has got the highest placement");
            System.exit(1);
        }
        else if(cs > ec && cs > me){
            System.out.println("Highest placement\nCSE");
        }
        else if(ec > cs && ec > me){
            System.out.println("Highest placement\nECE");
        }
        else if(me > cs && me > ec){
            System.out.println("Highest placement\nMECH");
        }
        else{
            if(cs == ec && ec == me){
                System.out.println("None of the department has got the highest placement");
            }
            else if(cs == ec){
                System.out.println("Highest placement\nCSE\nECE");
            }
            else if(ec == me){
               System.out.println("Highest placement\nECE\nMECH");
            }
            else{
                System.out.println("Highest placement\nCSE\nMECH");
            }
        }
    }
}