package proxy_factory;
//¿Í»§¶Ë
public class Client {
	public static void main(String args[]) {
		Picture picture;
		picture=(Picture)XMLUtil.getBean();
		picture.run();
	}
	
}
