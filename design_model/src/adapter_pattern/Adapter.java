package adapter_pattern;

public class Adapter implements Dog,Cat{
	private Cat cat;
	private Dog dog;
	public void setCat(Cat cat) {
		this.cat=cat;
	}
	public void setDog(Dog dog) {
		this.dog=dog;
	}
	//èѧ����
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("èѧ����");
		dog.wang();
	}
    //èץ����
	@Override
	public void catchMouse() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	}
     //����
	@Override
	public void wang() {
		// TODO Auto-generated method stub
		dog.wang();
	}
    //��ѧèץ����
	@Override
	public void action() {
		// TODO Auto-generated method stub
	System.out.println("��ѧè��");
		cat.catchMouse();
	}

}
