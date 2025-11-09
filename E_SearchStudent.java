package student_record_management_system;

import java.util.Scanner;

public class E_SearchStudent {
	private Scanner input;
	
	public E_SearchStudent(Scanner input) {
		this.input = input;
	}
	
	public void execute() {
		System.out.print("Enter ID to search: ");
		String id = input.nextLine();
		
		for (A_Student s : B_StudentRecords.studentList) {
			if (s.getStudentID().equals(id)) {
				System.out.println("Student found: ");
				System.out.println(s);
				pause();
				return;
			}
		}
		
		System.out.println("Student not found.");
		pause();
	}
	
	private void pause() {
		System.out.println("\nPress Enter to return to the main menu...");
		input.nextLine();
	}
}
	
	

