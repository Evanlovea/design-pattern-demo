package prototype_mode;
//ԭ��ģʽ
public class Client {
	public static void main(String args[]) {
		WeeklyLog log_previous=new WeeklyLog();
		log_previous.setName("����");
		log_previous.setDate("2010��ڶ���");
		log_previous.setContent("���¹�����æ��ÿ��Ӱ�");
		
		System.out.println("****�±�******");
		System.out.println(log_previous.getName());
		System.out.println(log_previous.getDate());
		System.out.println(log_previous.getContent());
		System.out.println("----------------");
		
		WeeklyLog log_now;
		log_now=(WeeklyLog)log_previous.clone();
		log_now.setDate("2010���13��");
		System.out.println("***�±�*****");
		System.out.println(log_now.getName());
		System.out.println(log_now.getDate());
		System.out.println(log_now.getContent());
	}
}
