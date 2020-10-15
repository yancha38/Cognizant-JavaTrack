import java.util.Scanner;
import java.util.regex.*;

public class UniqueChar{
    
    public static boolean checkSentence(String str){
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(str);
        boolean check = m.find();
        return check;
    }
    
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the sentence:");
        String sen = s.nextLine();
        s.close();
        
        if((sen == null) || (checkSentence(sen))){
            System.out.println("Invalid Sentence");
            System.exit(0);
        }
        else{
            int[] count = new int[256];
            int i;
            for(i = 0; i < sen.length(); i++){
                if(sen.charAt(i) != ' '){
                    count[(int)sen.charAt(i)]++;
                }
            }
            int n = i, j = 0;
            char[] chars = new char[50];
            for(i = 0; i < n; i++){
                if(count[(int)sen.charAt(i)] == 1){
                    chars[j++] = sen.charAt(i);
                }
            }
            if(j == 0){
                System.out.println("No unique characters");
                System.exit(0);
            }
            else{
                System.out.println("Unique characters:");
                for(i = 0; i < j; i++){
                    System.out.println(chars[i]);
                }
            }
        }
    }
}