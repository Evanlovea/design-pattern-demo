package adapter_pattern;

public class Client {
//˫��������
	public static void main(String[] args) {
		Cat cat=new Cat() {

			@Override
			public void cry() {
				// TODO Auto-generated method stub
				System.out.println("è��");
			}

			@Override
			public void catchMouse() {
				// TODO Auto-generated method stub
				System.out.println("èץ����");
			}
			
		};
		Dog dog=new Dog() {

			@Override
			public void wang() {
				// TODO Auto-generated method stub
				System.out.println("����");
			}

			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("����action");
			}
			
		};
		Cat cat1=new DogAndCatAdapter(cat,dog);
		cat1.cry();
		Dog dog1=new DogAndCatAdapter(cat,dog);
		dog1.action();
	}

}
