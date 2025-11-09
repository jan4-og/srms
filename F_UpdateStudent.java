package student_record_management_system;

import java.util.Scanner;

public class F_UpdateStudent {
	private Scanner input;
	
	public F_UpdateStudent(Scanner input) {
		this.input = input;
	}
	
	public void execute() {
		System.out.println("Enter ID to update: ");
		String id = input.nextLine();
		
		for (A_Student s : B_StudentRecords.studentList) {
			if (s.getStudentID().equals(id)) {
				System.out.println("Enter new name: ");
				String newName = input.nextLine();
				System.out.println("Enter new course: ");
				String newCourse = input.nextLine();
				System.out.println("Enter new year level: ");
				int newYearLevel;
				
				try {
					newYearLevel = Integer.parseInt(input.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Invalid year level!");
					pause();
					return;
				}
				
				s.setName(newName);
				s.setCourse(newCourse);
				s.setYearLevel(newYearLevel);
				
				System.out.println("Student updated successfully!");
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
