package template_method_pattern;
//抽象父类角色
public abstract class Account {
	public abstract void getUserType();//用户种类
	public abstract void calculateInterest();//计算利息
	public void findUser() {
		System.out.println("查询用户信息");
	}
	public void display() {
		System.out.println("显示利息");
	}
	//模板方法
	public void handle() {
		this.findUser();//查找用户
		this.getUserType();//获取用户类型
		this.calculateInterest();//按照用户类型计算利息
		this.display();//展示
	}
}
