import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

	public static Hosteller getHostellerDetails() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Hosteller hosteller = new Hosteller();

		System.out.println("ENTER THE DETAILS");
		System.out.println("Student Id : ");
		int id = s.nextInt();
		hosteller.setStudentId(id);

		System.out.println("Student Name : ");
		String name = s.next();
		hosteller.setName(name);

		System.out.println("Department Id : ");
		int deptId = s.nextInt();
		hosteller.setDepartmentId(deptId);

		System.out.println("Gender : ");
		String gender = s.next();
		hosteller.setGender(gender);

		System.out.println("Phone Number : ");
		String phone = s.next();
		hosteller.setPhone(phone);

		System.out.println("Hostel Name : ");
		String hostel = s.next();
		hosteller.setHostelName(hostel);

		System.out.println("Room Number : ");
		int room = s.nextInt();
		hosteller.setRoomNumber(room);

		return hosteller;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Hosteller host = getHostellerDetails();

		System.out.println("Modify Room Number(Y/N) : ");
		boolean modify = s.next().equals("Y");

		if (modify) {
			System.out.println("New Phone Number : ");
			int newNum = s.nextInt();
			host.setRoomNumber(newNum);
		}

		System.out.println("Modify Phone Number(Y/N) : ");
		boolean update = s.next().equals("Y");
		if (update) {
			System.out.println("New Room Number : ");
			String newNo = s.next();
			host.setPhone(newNo);
		}

    //We can use any of the following -- StringJoiner or StringBuilder. The method name will change with respect to that.
    
		StringJoiner st = new StringJoiner(" ");
		st.add(String.valueOf(host.getStudentId())).add(host.getName()).add(String.valueOf(host.getDepartmentId()))
				.add(host.getGender()).add(host.getPhone()).add(host.getHostelName())
				.add(String.valueOf(host.getRoomNumber()));

		StringBuilder sb = new StringBuilder();
		sb.append(String.valueOf(host.getStudentId()) + " ").append(host.getName() + " ")
				.append(String.valueOf(host.getDepartmentId()) + " ").append(host.getGender() + " ")
				.append(host.getPhone() + " ").append(host.getHostelName() + " ")
				.append(String.valueOf(host.getRoomNumber()));

    //Also check the next println with the one in your problem. I have changed it a bit. You might get error.
		System.out.println("------THE STUDENT DETAILS------");
		System.out.println(st.toString());
		s.close();
	}

}
