package decorator_pattern;
//��һ��װ����-�ڿ�װ��
public class BlackFrameDecorator extends Decorator {
    Component component;
	public BlackFrameDecorator(Component component) {
		this.component=component;
		
	}
	//
	public void display() {
		
		component.display();
		System.out.println("��Ӻ�ɫ�߿�");
	}

}
