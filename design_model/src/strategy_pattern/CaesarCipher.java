package strategy_pattern;
//具体策略类
//凯撒密码加密
public class CaesarCipher implements Encryption {

	@Override
	public String doEncrypt(String plainText,String key ) {
		new CaesarEncryptCoder();
		// TODO Auto-generated method stub
		return CaesarEncryptCoder.caesarEncryption(plainText);
	}

}
