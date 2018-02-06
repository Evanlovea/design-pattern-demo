package state_pattern;



//������
/*
 * ��Ϸ����
 */
public class GameContext {
	private AbstractState state;//��ɫ״̬
	private String name;
	public GameContext(String name) {
		this.name=name;
		this.state=new PrimaryState(this);//��ʼ״̬
		System.out.println(this.name+"������Ϸ");
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
	//����Ϸ����
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
