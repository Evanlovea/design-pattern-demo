package prototype_mode;
//具体原型类
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
	
	//克隆方法，浅克隆
	public Object clone() {
		Object obj=null;
		try {
			obj=super.clone();
			return obj;
			
		}catch(CloneNotSupportedException e) {
			System.out.println("不能复制");
			return null;
		}
	}
}
