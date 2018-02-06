package visitor_pattern;
//抽象元素类
//员工类
public interface Employee {
	//接受一个抽象访问者访问  
	 public void accept(Department handler); 
}
