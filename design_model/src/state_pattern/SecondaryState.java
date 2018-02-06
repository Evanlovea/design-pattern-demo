package state_pattern;

public class SecondaryState extends AbstractState {
	public SecondaryState(AbstractState state) {
		this.point=state.point;
		this.grade="熟练级";
	this.gameContext=state.gameContext;
	}
	 public SecondaryState(GameContext gameContext) {
		this.point=0;
		this.grade="熟练级";
		this.gameContext=gameContext;
	}
	@Override
	public void play(int score, String result) {
		// TODO Auto-generated method stub
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
		if(result.equalsIgnoreCase("win")) {
			this.point+=2*score;
			System.out.println("玩家"+this.gameContext.getName()+"获胜,增加积分"+score+",当前积分为"+this.point+".");
		}else if(result.equalsIgnoreCase("lose")) {
			this.point-=score;
			System.out.println("玩家"+this.gameContext.getName()+"失败,损失积分"+score+",当前积分为"+this.point+".");
		}
		this.check();


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
		// TODO Auto-generated method stub
		if(this.point>=6000) {
			this.gameContext.setState(new FinalState(this));
		}else if(this.point>=3000) {
			this.gameContext.setState(new ProfessionalState(this));
		}else if(this.point>=1000) {
			this.gameContext.setState(new SecondaryState(this));
		}else {
			this.gameContext.setState(new PrimaryState(this));
		}
	}
	}


