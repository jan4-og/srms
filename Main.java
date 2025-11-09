package student_record_management_system;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		C_AddStudent add = new C_AddStudent(input);
		D_ViewAllStudents view = new D_ViewAllStudents(input);
		E_SearchStudent search = new E_SearchStudent(input);
		F_UpdateStudent update = new F_UpdateStudent(input);
		G_DeleteStudent delete = new G_DeleteStudent(input);
		
 		int choice = 0;
		
		do {
			System.out.println("\n=== STUDENT RECORD MANAGEMENT SYSTEM ===");
			System.out.println("1. Add Student");
			System.out.println("2. View All Students");
			System.out.println("3. Search Student");
			System.out.println("4. Update Student");
			System.out.println("5. Delete Student");
			System.out.println("6. Exit");
			System.out.println("Enter your choice: ");

			String line = input.nextLine();
			try {
				choice = Integer.parseInt(line);
			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Enter a number: ");
				continue;
			}
			
			switch (choice ) {
			case 1:
				add.execute();
			case 2:
				view.execute();
			case 3:
				search.execute();
			case 4:
				update.execute();
			case 5:
				delete.execute();
			case 6:
				System.out.println("Exiting program. Goodbye!");
			default:
				System.out.println("Invalid choice. Try again.");
			}
		} while (choice != 6);
		
		input.close();
	}
}
