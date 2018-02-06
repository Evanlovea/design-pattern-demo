package chain_of_responsibility_pattern;
//请求类
public class Mission {
   public int getEnemyNum() {
		return enemyNum;
	}
	public void setEnemyNum(int enemyNum) {
		this.enemyNum = enemyNum;
	}
   private int enemyNum;//敌人数量
   public Mission(int enemyNum) {
	   this.enemyNum=enemyNum;
   }
   
}
