import java.util.Scanner;

public class StudentMain{
    
    public static Student getStudentDetails() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the id:");
        int id = s.nextInt();
        
        System.out.println("Enter the name:");
        String name = s.next();
        
        int no = 0;
        boolean flag = true;
        while(true){
            System.out.println("Enter the no of subjects:");
            no = s.nextInt();
            if(no <= 0){
                System.out.println("Invalid number of subject");
            }
            else break;
        }
        
        int[] marks = new int[no];
        for(int i = 0; i < no; ++i){
            int mark = 0;
            
            while(true){
                System.out.println("Enter mark for subject " +(i + 1) + ":");
                mark = s.nextInt();
                
                if(mark < 0 && mark > 100){
                    System.out.println("Invalid Mark");
                    System.exit(0);
                }
                else break;
            }
            
            marks[i] = mark;
        }
        Student std = new Student(id, name, marks);
        return std;
    }
    
    public static void main (String[] args) {
        Student st = getStudentDetails();
        st.calculateAvg();
        st.findGrade();
        
        System.out.println("Id:" + st.getId());
        System.out.println("Name:" + st.getName());
        System.out.println("Average:" + st.getAverage());
        System.out.println("Grade:" + st.getGrade());
    }
}
