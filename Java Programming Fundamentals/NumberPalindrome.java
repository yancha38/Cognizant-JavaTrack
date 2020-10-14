import java.util.Scanner;

public class NumberPalindrome{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        int num = s.nextInt();
        s.close();
        int rev = 0;;
        if(num < 0){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        int temp = num;
        while(temp != 0){
            int rem = (temp % 10);
            rev = rev * 10 + rem;
            temp = (temp / 10);
        }
        if(num == rev){
            System.out.println("Palindrome");
        }
        else System.out.println("Not a Palindrome");
    }
}