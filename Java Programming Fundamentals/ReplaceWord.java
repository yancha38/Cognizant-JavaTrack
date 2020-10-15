import java.util.Scanner;

public class ReplaceWord{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = s.nextLine();
        System.out.println("Enter the word to be searched:");
        String word = s.nextLine();
        System.out.println("Enter the word to be replaced:");
        String re = s.nextLine();
        s.close();
        
        if(str.contains(word)){
            String replace = str.replace(word, re);
            System.out.println(replace);
        }
        else{
            System.out.println("The word " + word + " not found");
            System.exit(0);
        }
    }
}