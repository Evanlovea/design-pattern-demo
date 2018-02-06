package iterator_pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class obj=new Class();
		Student student1,student2;
		student1=new Student("zhangsan", 30);
		student2=new Student("lisi", 20);
		obj.addStudent(student1);
		obj.addStudent(student2);
		obj.displayStudents();

}
}
