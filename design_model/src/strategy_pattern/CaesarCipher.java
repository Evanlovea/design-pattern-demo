package strategy_pattern;
//���������
//�����������
public class CaesarCipher implements Encryption {

	@Override
	public String doEncrypt(String plainText,String key ) {
		new CaesarEncryptCoder();
		// TODO Auto-generated method stub
		return CaesarEncryptCoder.caesarEncryption(plainText);
	}

}
