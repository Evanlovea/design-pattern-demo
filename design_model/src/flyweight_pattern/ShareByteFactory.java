package flyweight_pattern;

import java.util.Hashtable;
//��Ԫ������
public class ShareByteFactory {
	private Hashtable ht;//��ϣ��
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
