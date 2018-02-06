package iterator_pattern;

public class Student {
	private String studentName;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudnetAge() {
		return studnetAge;
	}
	public void setStudnetAge(int studnetAge) {
		this.studnetAge = studnetAge;
	}
	private int studnetAge;
	public Student(String studentName,int studentAge) {
		this.studentName=studentName;
		this.studnetAge=studentAge;
	}
}
