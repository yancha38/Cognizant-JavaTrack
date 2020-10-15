import java.util.*;
public class LeastOffer{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
     
        int noOfItems = s.nextInt();
        String[] str = new String[noOfItems];
        int min = 33000;
        for(int i = 0; i < noOfItems; i++){
            str[i] = s.next();
        }
        s.close();
        for(int i = 0; i < noOfItems; i++){
            String[] words = str[i].split(",");
            int cal = (Integer.parseInt(words[1]) * Integer.parseInt(words[2])) / 100;
            if(min > cal){
                min = cal;
            }
        }
        for(int i = 0; i < noOfItems; i++){
            String[] words = str[i].split(",");
            int cal = (Integer.parseInt(words[1]) * Integer.parseInt(words[2])) / 100;
            if(min == cal){
                System.out.println(words[0]);
            }
        }
    }
}