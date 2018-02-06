package chain_of_responsibility_pattern;

public class YingZhang extends Officer {

	public YingZhang(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handleMission(Mission mission) {
		if(mission.getEnemyNum()<200&&mission.getEnemyNum()>=50) {
			System.out.println("营长"+name+"处理敌人数量为"+mission.getEnemyNum()+"的情报");
		}else {
			
				System.out.println("由于敌人数量太多，需要开会进行讨论再下达作战命令！");
			

		}
	}

}
