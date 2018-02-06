package strategy_pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//���������㷨
public class CaesarEncryptCoder {
	public static final String SOURCE = "abcdefghijklmnopqrstuvwxyz";
	 public static final int LEN = SOURCE.length();
	//Encryption
	 public static String caesarEncryption(String s) {
	     StringBuilder sb = new StringBuilder();

	     if (s == null || s.length() < 1) {
	         System.out.println("you Input nothing.");
	         return null;
	     }

	     if (!isAlp(s)) {
	         System.out.println("input ABC... only");
	         return null;
	     }

	     s = s.toLowerCase();

	     int len = s.length();
	     for (int j = 0; j < len; j++) {
	         char c = s.charAt(j);
	         int a = SOURCE.indexOf(c);
	         if (a == LEN -1) a = -1;
	         if (a == LEN -2) a = -2;
	         if (a == LEN - 3) a = -3;
	         sb.append(SOURCE.charAt(a + 3));
	     }
	     return sb.toString();
	 }
	 public static boolean isAlp(String s) {
	     String p = "^[A-Za-z]+$";
	     Pattern pattern = Pattern.compile(p);
	     Matcher matcher = pattern.matcher(s);
	     if (matcher.find()) {
	         return true;
	     }
	     return false;
	 }

/*	private static CaesarEncryptCoder caesar = new CaesarEncryptCoder();

	   public static CaesarEncryptCoder getInstance()
	   {
	      return caesar;
	   }

	   private CaesarEncryptCoder()
	   {
	   }

	   public String encrypt(String str, int k)
	   {
	      StringBuilder result = new StringBuilder();
	      for (char c : str.toCharArray())
	      {
	         // ����ַ����е�ĳ���ַ���Сд��ĸ
	         if (c >= 'a' && c <= 'z')
	         {
	            c += k % 26; // �ƶ�key%26λ
	            if (c < 'a')
	               c += 26; // ���󳬽�
	            if (c > 'z')
	               c -= 26; // ���ҳ���
	         }
	         // ����ַ����е�ĳ���ַ��Ǵ�д��ĸ
	         else if (c >= 'A' && c <= 'Z')
	         {
	            c += k % 26; // �ƶ�key%26λ
	            if (c < 'A')
	               c += 26;// ͬ��
	            if (c > 'Z')
	               c -= 26;// ͬ��
	         }
	         result.append(c);
	      }
	      return result.toString();
	   }

	   public String decrypt(String str, int k)
	   {
	      // ȡ�෴��
	      k = 0 - k;
	      return encrypt(str, k);
	   }*/
	  
}
