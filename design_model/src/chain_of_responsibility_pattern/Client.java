package chain_of_responsibility_pattern;
//�ͻ�����
public class Client {

	public static void main(String[] args) {
		Officer officer1,officer2,officer3;
		officer1=new BanZhang("����");
		officer2=new PaiZhang("����");
		officer3=new YingZhang("���");
		officer1.setOfficer(officer2);
		officer2.setOfficer(officer3);
		Mission mission1=new Mission(9);
		Mission mission2=new Mission(200);
	
		officer1.handleMission(mission1);
		officer1.handleMission(mission2);
	
	}

}
