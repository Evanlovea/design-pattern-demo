package bridge_pattern;

public class Client {
   public static void main(String args[]) {
	   //�Ž�ģʽ
	   
	   Product product;
	   Factory factory;
	   product=(Product)XMLUtilFactory.getBean("product");
	   factory=(Factory)XMLUtilFactory.getBean("factory");
	   factory.setProduct(product);
	   factory.produce("����");
   }
}
