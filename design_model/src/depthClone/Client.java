package depthClone;

public class Client {
   public static  void main(String args[]) {
	   Customer customer,customerCopy=null;
	   customer=new Customer();
	   try {
		   customerCopy=(Customer)customer.deepClone();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   System.out.println("customer==customerClone?");
		System.out.println(customer==customerCopy);
		System.out.println("customer.getAddress==customerClone.getAddress?");
		System.out.println(customer.getAddress()==customerCopy.getAddress());
   }
}
