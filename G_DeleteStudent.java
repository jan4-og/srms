package student_record_management_system;

import java.util.Scanner;

public class G_DeleteStudent {
	private Scanner input;
	
	public G_DeleteStudent(Scanner input) {
		this.input = input;
	}
	
	public void execute() {
		System.out.println("Enter ID to delete: ");
		String i = input.nextLine();
		
		for (A_Student s : B_StudentRecords.studentList) {
			if (s.getStudentID().equals(i)) {
				B_StudentRecords.studentList.remove(s);
				System.out.println("Student deleted successfully!");
				pause();
				return;
			}
		}
		
		System.out.println("Student not found");
		pause();
	}
	
	private void pause() {
		System.out.print("\nPress Enter to return to the main menu...");
		input.nextLine();
	}
}
