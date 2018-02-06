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
	//猫学狗叫
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("猫学狗：");
		dog.wang();
	}
    //猫抓老鼠
	@Override
	public void catchMouse() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	}
     //狗叫
	@Override
	public void wang() {
		// TODO Auto-generated method stub
		dog.wang();
	}
    //狗学猫抓老鼠
	@Override
	public void action() {
		// TODO Auto-generated method stub
	System.out.println("狗学猫：");
		cat.catchMouse();
	}

}
