package strategy_pattern;
//具体策略类
//DES密码加密
public class ModCipher implements Encryption {

	@Override
	public String doEncrypt( String plainText,String key) {
		
		  new DesEncryptCoder();
		String encryptString = DesEncryptCoder.encrypt(key, plainText);
		
		return encryptString;
	}

}
