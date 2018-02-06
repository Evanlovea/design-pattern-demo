package state_pattern;



//环境类
/*
 * 游戏环境
 */
public class GameContext {
	private AbstractState state;//角色状态
	private String name;
	public GameContext(String name) {
		this.name=name;
		this.state=new PrimaryState(this);//初始状态
		System.out.println(this.name+"进入游戏");
	}
	public void setState(AbstractState state) {
		this.state=state;
	}
	public AbstractState getState() {
		return this.state;
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	//玩游戏方法
	public void play(int score,String result) {
		state.play(score,result);
	}
	public void doubleScore(int score,String result) {
		state.doubleScore(score,result);
	}
	public void changeCards() {
		state.changeCards();
	}
	public void peekCards() {
		 state.peekCards();
	}

}
