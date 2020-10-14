import java.util.Scanner;

public class AsciValue{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] arr = new int[4];
        System.out.println("Enter the digits:");
        for(int i = 0; i < 4; i++){
            arr[i] = s.nextInt();
        }
        s.close();
        for(int i = 0; i < 4; i++){
            System.out.println(arr[i] + "-" + (char)arr[i]);
        }
    }
}