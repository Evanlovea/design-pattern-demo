package template_method_pattern;
//具体子类
public class CurrentAccount extends Account {

	@Override
	public void getUserType() {
		System.out.println("用户类型：VIP");

	}

	@Override
	public void calculateInterest() {
		System.out.println("利息为0.05%");

	}

}
