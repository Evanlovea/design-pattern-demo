package decorator_pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component component=new TextView();
		component.display();
		BlackFrameDecorator b=new BlackFrameDecorator(component);
		b.display();
		ScrollBarDecorator s=new ScrollBarDecorator(component);
		s.display();
		AllComponentDecorator all=new AllComponentDecorator(component);
		all.display();
	}

}
