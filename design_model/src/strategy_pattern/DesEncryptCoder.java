package strategy_pattern;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class DesEncryptCoder {
	 private final static String DES = "DES";
     
	    public static byte[] encrypt(byte[] src, byte[] key) throws Exception {
	        // DES�㷨Ҫ����һ�������ε������Դ
	        SecureRandom sr = new SecureRandom();
	        // ��ԭʼ�ܳ����ݴ���DESKeySpec����
	        DESKeySpec dks = new DESKeySpec(key);
	        // ����һ���ܳ׹�����Ȼ��������DESKeySpecת����һ��SecretKey����
	        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
	        SecretKey securekey = keyFactory.generateSecret(dks);
	        // Cipher����ʵ����ɼ��ܲ���
	        Cipher cipher = Cipher.getInstance(DES);
	        // ���ܳ׳�ʼ��Cipher����
	        cipher.init(Cipher.ENCRYPT_MODE, securekey, sr);
	        // ��ʽִ�м��ܲ���
	        return cipher.doFinal(src);
	    }
	                      
	    /**
	     *
	     * @param password ����
	     * @param key �����ַ���
	     * @return
	     */
	    public final static String encrypt(String password, String key) {
	        try {
	            return byte2String(encrypt(password.getBytes(), key.getBytes()));
	        } catch (Exception e) {
	        }
	        return null;
	    }
	                      
	    public static String byte2String(byte[] b) {
	        String hs = "";
	        String stmp = "";
	        for (int n = 0; n < b.length; n++) {
	            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
	            if (stmp.length() == 1)
	                hs = hs + "0" + stmp;
	            else
	                hs = hs + stmp;
	        }
	        return hs.toUpperCase();
	    }
	    public static void main(String[] args){
	        String encryptString = encrypt("is������","test��Ӣ�������ð˻��@123654{");
	        System.out.println(encryptString);
	    }
}
