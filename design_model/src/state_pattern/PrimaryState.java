package state_pattern;
//具体状态类 新手状态类
public class PrimaryState extends AbstractState {

	public PrimaryState(AbstractState state) {
		this.point=state.point;
		this.grade="入门级";
	this.gameContext=state.gameContext;
	}
	 public PrimaryState(GameContext gameContext) {
		this.point=0;
		this.grade="入门级";
		this.gameContext=gameContext;
	}

	@Override
	public void play(int score, String result) {
		if(result.equalsIgnoreCase("win")) {
			this.point+=score;
			System.out.println("玩家"+this.gameContext.getName()+"获胜,增加积分"+score+",当前积分为"+this.point+".");
		}else if(result.equalsIgnoreCase("lose")) {
			this.point-=score;
			System.out.println("玩家"+this.gameContext.getName()+"失败,损失积分"+score+",当前积分为"+this.point+".");
		}
		this.check();
		
	}
	@Override
	public void doubleScore(int score, String result) {
		System.out.println("暂不支持该功能！");
		
	}
	@Override
	public void changeCards() {
		System.out.println("暂不支持该功能！");
		
	}
	@Override
	public void peekCards() {
		System.out.println("暂不支持该功能！");
		
	}
	@Override
	public void check() {
		if(this.point>=6000) {
			this.gameContext.setState(new FinalState(this));
		}else if(this.point>=3000) {
			this.gameContext.setState(new ProfessionalState(this));
		}else if(this.point>=1000) {
			this.gameContext.setState(new SecondaryState(this));
		}
	}

}
