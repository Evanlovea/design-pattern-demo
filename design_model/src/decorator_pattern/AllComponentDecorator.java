package decorator_pattern;

public class AllComponentDecorator extends Decorator{
	Component component;
     public AllComponentDecorator(Component component) {
    		this.component=component;
     }
	@Override
	public void display() {
		System.out.println("加黑色相框");
		System.out.println("加滚动框");
		component.display();
		
	}

}
