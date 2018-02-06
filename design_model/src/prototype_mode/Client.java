package prototype_mode;
//原型模式
public class Client {
	public static void main(String args[]) {
		WeeklyLog log_previous=new WeeklyLog();
		log_previous.setName("张三");
		log_previous.setDate("2010年第二月");
		log_previous.setContent("这月工作很忙，每天加班");
		
		System.out.println("****月报******");
		System.out.println(log_previous.getName());
		System.out.println(log_previous.getDate());
		System.out.println(log_previous.getContent());
		System.out.println("----------------");
		
		WeeklyLog log_now;
		log_now=(WeeklyLog)log_previous.clone();
		log_now.setDate("2010年第13月");
		System.out.println("***月报*****");
		System.out.println(log_now.getName());
		System.out.println(log_now.getDate());
		System.out.println(log_now.getContent());
	}
}
