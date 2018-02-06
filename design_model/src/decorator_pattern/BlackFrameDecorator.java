package decorator_pattern;
//第一层装饰器-黑框装饰
public class BlackFrameDecorator extends Decorator {
    Component component;
	public BlackFrameDecorator(Component component) {
		this.component=component;
		
	}
	//
	public void display() {
		
		component.display();
		System.out.println("添加黑色边框");
	}

}
