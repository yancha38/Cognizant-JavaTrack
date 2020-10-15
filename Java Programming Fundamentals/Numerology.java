import java.util.Scanner;

public class Numerology{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        char[][] arr = new char[][]{{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','Y','Z'},
        {1, 2, 3, 4, 5, 8, 3, 5, 1, 1, 2, 3, 4, 5, 7, 8, 1, 2, 3, 4, 6, 6, 6, 5, 1, 7}};
        System.out.println("Enter your name:");
        String name = s.nextLine();
        s.close();
        
        if(!name.matches("^[A-Z]+$")){
            System.out.println("Invalid name");
            System.exit(0);
        }
        else{
            int j = 0;
            int[] add = new int[50];
            for(int i = 0; i < name.length(); i++){
                for(int row = 0; row < arr.length; row++){
                    for(int col = 0; col < arr[row].length; col++){
                        if(arr[row][col] == name.charAt(i)){
                            int pos = col;
                            add[j++] = arr[1][pos];
                        }
                    }
                }
            }
            int sum = 0;
            for(int k = 0; k < j; k++){
                sum += add[k];
            }
            System.out.println("Your numerology no is:" + sum);
        }
    }
}