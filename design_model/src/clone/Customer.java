package clone;
//客户类
public class Customer implements Cloneable{
private Address address=null;
	
	public Customer ()
	{
		this.address=new Address();
	}
	
	public Object clone()
	{
		Customer clone=null;
		try
		{
			clone=(Customer)super.clone();		
		}
        catch(CloneNotSupportedException e)
        {
        	System.out.println("Clone failure!");
        }
		return clone;
	}
	
	public Address getAddress()
	{
		return this.address;
	}
	
	public void display()
	{
		System.out.println("查看客户地址");	
	}
}
