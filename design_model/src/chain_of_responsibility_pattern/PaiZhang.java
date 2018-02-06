package chain_of_responsibility_pattern;

public class PaiZhang extends Officer {

	public PaiZhang(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMission(Mission mission) {
		if(mission.getEnemyNum()<50&&mission.getEnemyNum()>=10) {
			System.out.println("排长"+name+"处理敌人数量为"+mission.getEnemyNum()+"的情报");
		}else {
			if(this.officer!=null) {
				this.officer.handleMission(mission);
			}
		}

	}

}
