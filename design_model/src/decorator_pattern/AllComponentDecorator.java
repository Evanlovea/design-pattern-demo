package decorator_pattern;

public class AllComponentDecorator extends Decorator{
	Component component;
     public AllComponentDecorator(Component component) {
    		this.component=component;
     }
	@Override
	public void display() {
		System.out.println("�Ӻ�ɫ���");
		System.out.println("�ӹ�����");
		component.display();
		
	}

}
