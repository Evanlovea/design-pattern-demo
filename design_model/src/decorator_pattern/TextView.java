package decorator_pattern;

public class TextView extends Component{
 
	public TextView() {
    	System.out.println("文本组件");
    }
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("显示文本");
	}

}
