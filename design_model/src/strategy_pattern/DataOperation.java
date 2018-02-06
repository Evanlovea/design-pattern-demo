package strategy_pattern;
//环境类角色
public class DataOperation {
	private Encryption encryption;
	public void setEncryption(Encryption encryption) {
		this.encryption=encryption;
	}
	public String doEncrypt(String plainText,String key) {
		return encryption.doEncrypt(plainText,key);
	}
}
