import java.util.Scanner;

public class HighestMarkPerSem{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter no of semester:");
        int no = s.nextInt();
        System.out.println("Enter no of subjects in 1 semester:");
        int sub1 = s.nextInt();
        System.out.println("Enter no of subjects in 2 semester:");
        int sub2 = s.nextInt();
        System.out.println("Enter no of subjects in 3 semester:");
        int sub3 = s.nextInt();
        int[] mark1 = new int[sub1];
        int[] mark2 = new int[sub2];
        int[] mark3 = new int[sub3];
        try{
            System.out.println("Marks obtained in semester 1:");
            for(int i = 0; i < sub1; i++){
                mark1[i] = s.nextInt();
                if(mark1[i] < 0 || mark1[i] > 100){
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
            System.out.println("Marks obtained in semester 2:");
            for(int i = 0; i < sub2; i++){
                mark2[i] = s.nextInt();
                if(mark2[i] < 0 || mark2[i] > 100){
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
            System.out.println("Marks obtained in semester 3:");
            for(int i = 0; i < sub3; i++){
                mark3[i] = s.nextInt();
                if(mark3[i] < 0 || mark3[i] > 100){
                    System.out.println("You have entered invalid mark.");
                    System.exit(0);
                }
            }
            s.close();
            int max1 = mark1[0];
            for(int i = 1; i < mark1.length; i++){
                    if(mark1[i] > max1){
                        max1 = mark1[i];
                    }
            }
            System.out.println("Maximum mark in 1 semester:" + max1);
        
            int max2 = mark2[0];
            for(int i = 1; i < mark2.length; i++){
                    if(mark2[i] > max2){
                        max2 = mark2[i];
                    }
            }
            System.out.println("Maximum mark in 2 semester:" + max2);
        
            int max3 = mark3[0];
            for(int i = 1; i < sub3; i++){
                    if(mark3[i] > max3){
                        max3 = mark3[i];
                    }
            }
            System.out.println("Maximum mark in 3 semester:" + max3);
            }
        catch(Exception e){
            System.out.println("You have entered invalid mark.");
        }
    }
}