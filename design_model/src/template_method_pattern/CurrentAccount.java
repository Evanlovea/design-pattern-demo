package template_method_pattern;
//��������
public class CurrentAccount extends Account {

	@Override
	public void getUserType() {
		System.out.println("�û����ͣ�VIP");

	}

	@Override
	public void calculateInterest() {
		System.out.println("��ϢΪ0.05%");

	}

}
