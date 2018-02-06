package bridge_pattern;

public abstract class Factory {
	protected Product product;
    public void setProduct(Product product) {
	 this.product=product;
   }
   public abstract void produce(String productName);
}
