package state_pattern;
//抽象状态类
public abstract class AbstractState {
	protected GameContext gameContext;
	protected int point;
	protected String grade;//等级
	//玩游戏方法
	public abstract void play(int score,String result);
	//双倍积分
	public abstract void doubleScore(int score,String result);
	//换牌功能
	public abstract void changeCards();
	//看牌
	public abstract void peekCards();
	public abstract void check();
/*
	protected String stateName;
	public abstract void checkState(int score);//检查状态
	public void failGame(int score) {
		System.out.println(gameContext.getName()+"游戏失败，扣除"+score+"积分");
		this.point-=score;
		System.out.println("剩余积分为："+this.point+",当前级别为："+gameContext.getState().stateName+"。");
		
		
	}
	public void successGame(int score) {
		System.out.println(gameContext.getName()+"游戏胜利，增加"+score+"积分");
		this.point+=score;
		System.out.println("剩余积分为："+this.point+",当前级别为："+gameContext.getState().stateName+"。");
		
	}
	
	 * @Getter
	 * @Setter
	 
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}*/
}
