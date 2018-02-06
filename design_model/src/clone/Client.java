package clone;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer customer,customerClone;
			customer=new Customer();
			customerClone=(Customer)customer.clone();
			System.out.println("customer==customerClone?");
			System.out.println(customer==customerClone);
			System.out.println("customer.getAddress==customerClone.getAddress?");
			System.out.println(customer.getAddress()==customerClone.getAddress());
	}

}
