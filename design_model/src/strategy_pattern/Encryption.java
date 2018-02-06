package strategy_pattern;
//抽象策略类
//加密算法
public interface Encryption {
	public String  doEncrypt(String plainText,String key);
}
