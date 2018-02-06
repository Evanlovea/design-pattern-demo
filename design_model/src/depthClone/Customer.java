package depthClone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.Serializable;

public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Address address=null;
	public Customer() {
		this.address=new Address();
	}
	public Object deepClone()throws IOException ,ClassNotFoundException,OptionalDataException{
		//将对象写入流中
		ByteArrayOutputStream bao=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bao);
		oos.writeObject(this);
		//将对象从流中取出
		ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		return (ois.readObject());
		
	}
	public Address getAddress() {
		return this.address;
	}
	public void display() {
		System.out.println("查看客户地址");
	}
}
