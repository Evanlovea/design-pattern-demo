package template_method_pattern;
//�������ɫ
public abstract class Account {
	public abstract void getUserType();//�û�����
	public abstract void calculateInterest();//������Ϣ
	public void findUser() {
		System.out.println("��ѯ�û���Ϣ");
	}
	public void display() {
		System.out.println("��ʾ��Ϣ");
	}
	//ģ�巽��
	public void handle() {
		this.findUser();//�����û�
		this.getUserType();//��ȡ�û�����
		this.calculateInterest();//�����û����ͼ�����Ϣ
		this.display();//չʾ
	}
}
