package bridge_pattern;

public class TCL extends Factory {
	@Override
	public void produce(String productName) {
		// TODO Auto-generated method stub
         String factoryName="TCL";
         this.product.produce(factoryName, productName);
	}
}
