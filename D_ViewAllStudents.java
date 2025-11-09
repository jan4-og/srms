package student_record_management_system;

import java.util.Scanner;

public class D_ViewAllStudents {
	private Scanner input;
	
	public D_ViewAllStudents(Scanner input) {
		this.input = input;
	}
	
	public void execute() {
		if (B_StudentRecords.studentList.isEmpty()) {
			System.out.println("No Students to display.");
		} else {
			System.out.println("\n=== STUDENT LIST===");
			for (A_Student s : B_StudentRecords.studentList) {
				System.out.println(s);
			}
		}
		pause();
	}
	private void pause() {
		System.out.println("\nPress Enter to return to the main menu...");
		input.nextLine();
	}
}