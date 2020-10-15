import java.util.Scanner;

public class CompatibleArrays{
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the size for First array:");
        int fSize = s.nextInt();
        if(fSize > 0){
            int[] fArr = new int[fSize];
            System.out.println("Enter the elements for First array:");
            for(int i = 0; i < fSize; i++){
                fArr[i] = s.nextInt();
            }
            System.out.println("Enter the size for Second array:");
            int nSize = s.nextInt();
            if(nSize > 0){
            int[] sArr = new int[nSize];
            System.out.println("Enter the elements for Second array:");
            for(int i = 0; i < nSize; i++){
                sArr[i] = s.nextInt();
            }
            s.close();
            
            boolean comp = true;
            if(fArr.length == sArr.length){
                for(int j = 0; j < fArr.length; j++){
                    if((fArr[j] != sArr[j]) && (fArr[j] < sArr[j])){
                        comp = false;
                    }
                }
            }
            else{
                comp = false;
            }
            if(comp){
                System.out.println("Arrays are Compatible");
            }
            else{
                System.out.println("Arrays are Not Compatible");
            }
            }
            else{
                System.out.println("Invalid array size");
                System.exit(0);
            }
        }
        else{
            System.out.println("Invalid array size");
            System.exit(0);
        }
    }
}