import java.util.Scanner;
import java.util.regex.*;

public class Palindrome{
    
    public static boolean checkCharacter(String str){
        String regex = "[A-Za-z0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        return m.matches();
    }
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the word :");
        String word = s.nextLine();
        s.close();
        
        boolean isPalindrome = true;
        int digitCount = word.length();
        if(!checkCharacter(word)){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else if(!word.matches("\\S+")){
            System.out.println("Invalid Input");
            System.exit(0);
        }
        else{
            for(int i = 0; i < digitCount; i++){
            String temp = word.toLowerCase();
            int range = digitCount / 2;
            if(digitCount % 2 == 0){
                range --;
            }
            for(int j = 0; j <= range; j++){
                if(temp.charAt(j) != temp.charAt(digitCount - j - 1)){
                    isPalindrome = false;
                }
            }
        }
        if(isPalindrome){
            System.out.println(word + " is a Palindrome");
        }
        else System.out.println(word + " is not a Palindrome");
        }
    }
}
