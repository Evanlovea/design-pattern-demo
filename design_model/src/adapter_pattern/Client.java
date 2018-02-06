package adapter_pattern;

public class Client {
//Ë«ÏòÊÊÅäÆ÷
	public static void main(String[] args) {
		Cat cat=new Cat() {

			@Override
			public void cry() {
				// TODO Auto-generated method stub
				System.out.println("Ã¨½Ğ");
			}

			@Override
			public void catchMouse() {
				// TODO Auto-generated method stub
				System.out.println("Ã¨×¥ÀÏÊó");
			}
			
		};
		Dog dog=new Dog() {

			@Override
			public void wang() {
				// TODO Auto-generated method stub
				System.out.println("¹·½Ğ");
			}

			@Override
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("¹·µÄaction");
			}
			
		};
		Cat cat1=new DogAndCatAdapter(cat,dog);
		cat1.cry();
		Dog dog1=new DogAndCatAdapter(cat,dog);
		dog1.action();
	}

}
