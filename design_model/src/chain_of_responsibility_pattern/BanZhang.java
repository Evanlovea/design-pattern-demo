package chain_of_responsibility_pattern;

public class BanZhang extends Officer {
	public BanZhang(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
	@Override
	public void handleMission(Mission mission) {
		// TODO Auto-generated method stub
		if(mission.getEnemyNum()<10) {
			System.out.println("�೤"+name+"�����������Ϊ"+mission.getEnemyNum()+"���鱨");
		}else {
			if(this.officer!=null) {
				this.officer.handleMission(mission);
			}
		}
	}

}
