package iterator_pattern;
//�༶

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//�ۺ���
public class Class {
	private ArrayList<Student> students=new ArrayList<Student>();
	public void addStudent(Student student) {
		students.add(student);
	}
	public void displayStudents() {
		Comparator comparator=new MyComparator();
		Collections.sort(students,comparator);
		Iterator iterator=students.iterator();
		while(iterator.hasNext()) {
			Student student=(Student)iterator.next();
			System.out.println("������"+student.getStudentName()+"����"+student.getStudnetAge());
		}
	}
}
