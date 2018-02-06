package flyweight_pattern;

import java.util.Hashtable;
//享元工厂类
public class ShareByteFactory {
	private Hashtable ht;//哈希表
	public ShareByteFactory() {
		ht=new Hashtable();
	}
	public SharingByte getSharingByte(String arg) {
		if(ht.containsKey(arg)) {
			return (SharingByte)ht.get(arg);
		}else {
			SharingByte str=new SharingByte(arg);
			ht.put(arg, str);
			return (SharingByte) ht.get(arg);
		}
		
		
	}
}
