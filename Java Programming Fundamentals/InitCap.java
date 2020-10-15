import java.util.Scanner;

public class InitCap{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = s.nextLine();
        s.close();
        
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.codePointAt(i) == ' '){
                if(str.charAt(i + 1) >= 65 && str.charAt(i + 1) <= 90){
                    count = 1;
                }
            }
        }
        if(count == 1){
            System.out.println("First character of each word is already in uppercase");
            System.exit(0);
        }
        else{
            String[] arr = str.split(" ");
            String d = null;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != null){
                    for(int j = 0; j < arr[i].length(); j++){
                        d = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1) + " ";
                    }
                }
                System.out.print(String.join(" ", d));
            }
        }
    }
}