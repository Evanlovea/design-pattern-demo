package chain_of_responsibility_pattern;
//客户端类
public class Client {

	public static void main(String[] args) {
		Officer officer1,officer2,officer3;
		officer1=new BanZhang("汪洋");
		officer2=new PaiZhang("二狗");
		officer3=new YingZhang("李刚");
		officer1.setOfficer(officer2);
		officer2.setOfficer(officer3);
		Mission mission1=new Mission(9);
		Mission mission2=new Mission(200);
	
		officer1.handleMission(mission1);
		officer1.handleMission(mission2);
	
	}

}
