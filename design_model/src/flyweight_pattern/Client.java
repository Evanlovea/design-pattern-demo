package flyweight_pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharingByte str1,str2;
		ShareByteFactory factory=new ShareByteFactory();
		str1=factory.getSharingByte("java");
		str1.setColor(new Color("ºìÉ«"));
		str1.setSize(new Size(5));
		str1.display();
		System.out.println("*********************************");
		str2=factory.getSharingByte("java");
		str2.setColor(new Color("°×É«"));
		str2.setSize(new Size(9));
		str2.display();
		System.out.println("******************************");
		System.out.println(str1==str2);
	}

}
