package bridge_pattern;

public class Refrigeratory implements Product{

	@Override
	public void produce(String factoryName, String productName) {
		// TODO Auto-generated method stub
		System.out.println(factoryName+"����"+productName);
	}


}
