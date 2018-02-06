package strategy_pattern;
//���������
//DES�������
public class ModCipher implements Encryption {

	@Override
	public String doEncrypt( String plainText,String key) {
		
		  new DesEncryptCoder();
		String encryptString = DesEncryptCoder.encrypt(key, plainText);
		
		return encryptString;
	}

}
