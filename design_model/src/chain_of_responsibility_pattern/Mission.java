package chain_of_responsibility_pattern;
//������
public class Mission {
   public int getEnemyNum() {
		return enemyNum;
	}
	public void setEnemyNum(int enemyNum) {
		this.enemyNum = enemyNum;
	}
   private int enemyNum;//��������
   public Mission(int enemyNum) {
	   this.enemyNum=enemyNum;
   }
   
}
