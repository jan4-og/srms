package student_record_management_system;

import java.util.Scanner;

public class C_AddStudent {
	private Scanner input;
	
	public C_AddStudent(Scanner input) {
		this.input = input;
	}
	
	public void execute() {
		System.out.println("Enter ID: ");
		String id = input.nextLine();
		
		for (A_Student s : B_StudentRecords.studentList) {
			if (s.getStudentID().equals(id)) {
				System.out.println("A student with this ID already exists!");
				pause();
				return;
			}
		}
		
		System.out.println("Enter Name: ");
		String name = input.nextLine();
		System.out.println("Enter Course: ");
		String course = input.nextLine();
		System.out.println("Enter Year Level: ");
		int year;
		try {
			year = Integer.parseInt(input.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("Invalid Year Level");
			pause();
			return;
		}
		
		B_StudentRecords.studentList.add(new A_Student(id, name, course, year));
		System.out.println("Student added successfully!");
		pause();
	}
	
	private void pause() {
		System.out.println("\nPress Enter to return to the main menu...");
		input.nextLine();
	}
}

