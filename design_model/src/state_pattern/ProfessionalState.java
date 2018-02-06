package state_pattern;

public class ProfessionalState extends AbstractState {
	public ProfessionalState(AbstractState state) {
		this.point=state.point;
		this.grade="���ּ�";
	this.gameContext=state.gameContext;
	}
	 public ProfessionalState(GameContext gameContext) {
		this.point=0;
		this.grade="���ּ�";
		this.gameContext=gameContext;
	}
	@Override
	public void play(int score, String result) {
		if(result.equalsIgnoreCase("win")) {
			this.point+=score;
			System.out.println("���"+this.gameContext.getName()+"��ʤ,���ӻ���"+score+",��ǰ����Ϊ"+this.point+".");
		}else if(result.equalsIgnoreCase("lose")) {
			this.point-=score;
			System.out.println("���"+this.gameContext.getName()+"ʧ��,��ʧ����"+score+",��ǰ����Ϊ"+this.point+".");
		}
		this.check();

	}

	@Override
	public void doubleScore(int score, String result) {
		if(result.equalsIgnoreCase("win")) {
			this.point+=2*score;
			System.out.println("���"+this.gameContext.getName()+"��ʤ,���ӻ���"+score+",��ǰ����Ϊ"+this.point+".");
		}else if(result.equalsIgnoreCase("lose")) {
			this.point-=score;
			System.out.println("���"+this.gameContext.getName()+"ʧ��,��ʧ����"+score+",��ǰ����Ϊ"+this.point+".");
		}
		this.check();


	}

	@Override
	public void changeCards() {
		System.out.println("����");

	}

	@Override
	public void peekCards() {
		System.out.println("�ݲ�֧�ָù��ܣ�");

	}

	@Override
	public void check() {
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


