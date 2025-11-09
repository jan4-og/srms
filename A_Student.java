package student_record_management_system;

public class A_Student {
	private String studentID;
	private String name;
	private String course;
	private int yearLevel;
	
	public A_Student(String studentID, String name, String course, int yearLevel) {
		this.studentID = studentID;
		this.name = name;
		this.course = course;
		this.yearLevel = yearLevel;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCourse() {
		return course;
	}
	
	public int getYearLevel() {
		return yearLevel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public void setYearLevel(int yearLevel) {
		this.yearLevel = yearLevel;
	}
	
	public String toString() {
		return "ID: " + studentID + " | Name: " + name +  " | Course: " + course + " | Year Level: " + yearLevel; 
	}
}