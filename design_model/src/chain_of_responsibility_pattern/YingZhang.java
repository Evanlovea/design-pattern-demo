package chain_of_responsibility_pattern;

public class YingZhang extends Officer {

	public YingZhang(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMission(Mission mission) {
		if(mission.getEnemyNum()<200&&mission.getEnemyNum()>=50) {
			System.out.println("Ӫ��"+name+"�����������Ϊ"+mission.getEnemyNum()+"���鱨");
		}else {
			
				System.out.println("���ڵ�������̫�࣬��Ҫ��������������´���ս���");
			

		}
	}

}
