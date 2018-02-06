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
			System.out.println("班长"+name+"处理敌人数量为"+mission.getEnemyNum()+"的情报");
		}else {
			if(this.officer!=null) {
				this.officer.handleMission(mission);
			}
		}
	}

}
