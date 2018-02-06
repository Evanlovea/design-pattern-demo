package strategy_pattern;



public class Client {
     public static void main(String args[]) {
     String key="is’≈»˝∑·";
      String plainText="test÷–”¢Œƒ‘”∆ﬂ¿√∞ÀªÏ¥Ó@123654{";
      String result;
      DataOperation dataOperation=new DataOperation();
      Encryption encryption;
      encryption=(Encryption)XMLUtil.getBean();
      dataOperation.setEncryption(encryption);
      result=dataOperation.doEncrypt(plainText, key);
	 System.out.println(result);
 }
}
