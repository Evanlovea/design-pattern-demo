package decorator_pattern;

public class ScrollBarDecorator extends Decorator {
	Component component;
	public ScrollBarDecorator(Component component) {
		this.component=component;
	}
	public void display() {
		
		component.display();
		System.out.println("增加滚动条");
	}

}
