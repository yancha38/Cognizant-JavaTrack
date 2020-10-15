import java.util.Scanner;

public class CumulativeSum{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter number of elements");
        int num = s.nextInt();
        int[] arr = new int[20];
        int[] out = new int[20];
        if((num <= 0) || (num > 20)){
            System.out.println("Invalid Range");
            System.exit(0);
        }
        else{
            System.out.println("Enter the elements");
            for(int i = 0; i < num; i++){
                arr[i] = s.nextInt();
            }
            s.close();
            if(arr.length == 0){
                System.out.println("Invalid Range");
                System.exit(0);
            }
            else{
                int sum = 0;
                for(int j = 0; j < num; j++){
                    sum += arr[j];
                    out[j] = sum;
                }
            }
            for(int i = 0; i < num; i++){
                System.out.print(out[i] + " ");
            }
        }
    }
}
