package adapter_pattern;

public class DogAndCatAdapter implements Dog,Cat{
    public Cat cat=null;
    public Dog dog=null;
    public DogAndCatAdapter(Cat cat,Dog dog) {
    	this.cat=cat;
    	this.dog=dog;
    }
  
   /* public void setCat(Cat cat) {
    	this.cat=cat;
    }
    public void setDog(Dog dog) {
    	this.dog=dog;
    }*/
	@Override
	public void wang() {
		// TODO Auto-generated method stub
		dog.wang();
	}
//��ѧèץ����
	@Override
	public void action() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	

}
//èѧ����
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		dog.wang();
	}

	@Override
	public void catchMouse() {
		// TODO Auto-generated method stub
		cat.catchMouse();
	}
}
