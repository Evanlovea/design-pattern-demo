package template_method_pattern;
//��������
public class SavingAccount extends Account {

	@Override
	public void getUserType() {
		System.out.println("�û����ͣ���ͨ�û�");

	}

	@Override
	public void calculateInterest() {
		System.out.println("��ϢΪ0.01%");

	}

}
