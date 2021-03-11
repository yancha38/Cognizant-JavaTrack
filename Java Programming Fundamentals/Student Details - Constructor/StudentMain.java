import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
       
		Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Student's Id:");
        int id = s.nextInt();
        System.out.println("Enter Student's Name:");
        String name = s.next();
        System.out.println("Enter Student's address:");
        String add = s.next();
        
        boolean flag = true;
        do{
            System.out.println("Whether the student is from NIT(Yes/No):");
            String str = s.next();
            if(str.equalsIgnoreCase("YES")){
            	Student st = new Student(id, name, add);
                st.setCollegeName("NIT");
                System.out.println("Student id:" +st.getStudentId());
                System.out.println("Student Name:" + st.getStudentName());
                System.out.println("Address:" + st.getStudentAddress());
                System.out.println("College name:" + st.getCollegeName());
                flag = true;
            }
            else if(str.equalsIgnoreCase("NO")){
            	System.out.println("Enter the college name:");
                String clgName = s.next();
                Student st = new Student(id, name, add, clgName);
                System.out.println("Student id:" +st.getStudentId());
                System.out.println("Student Name:" + st.getStudentName());
                System.out.println("Address:" + st.getStudentAddress());
                System.out.println("College name:" + st.getCollegeName());
                flag = false;
                s.close();
            }
            else{
                System.out.println("Wrong Input");
                flag = true;
            }
        }while(flag);
	}

}
