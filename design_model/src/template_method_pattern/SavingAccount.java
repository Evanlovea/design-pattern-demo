package template_method_pattern;
//具体子类
public class SavingAccount extends Account {

	@Override
	public void getUserType() {
		System.out.println("用户类型：普通用户");

	}

	@Override
	public void calculateInterest() {
		System.out.println("利息为0.01%");

	}

}
