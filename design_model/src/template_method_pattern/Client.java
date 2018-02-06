package template_method_pattern;

public class Client {
	public static void main(String args[]) {
		Account account;
		account=(Account)XMLUtil.getBean();
		account.handle();
	}

}
