package prototype_mode;
//����ԭ����
public class WeeklyLog implements Cloneable{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String date;
	private String content;
	
	//��¡������ǳ��¡
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
			return obj;
			
		}catch(CloneNotSupportedException e) {
			System.out.println("���ܸ���");
			return null;
		}
	}
}
