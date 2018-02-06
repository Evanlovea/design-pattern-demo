package state_pattern;
//����״̬��
public abstract class AbstractState {
	protected GameContext gameContext;
	protected int point;
	protected String grade;//�ȼ�
	//����Ϸ����
	public abstract void play(int score,String result);
	//˫������
	public abstract void doubleScore(int score,String result);
	//���ƹ���
	public abstract void changeCards();
	//����
	public abstract void peekCards();
	public abstract void check();
/*
	protected String stateName;
	public abstract void checkState(int score);//���״̬
	public void failGame(int score) {
		System.out.println(gameContext.getName()+"��Ϸʧ�ܣ��۳�"+score+"����");
		this.point-=score;
		System.out.println("ʣ�����Ϊ��"+this.point+",��ǰ����Ϊ��"+gameContext.getState().stateName+"��");
		
		
	}
	public void successGame(int score) {
		System.out.println(gameContext.getName()+"��Ϸʤ��������"+score+"����");
		this.point+=score;
		System.out.println("ʣ�����Ϊ��"+this.point+",��ǰ����Ϊ��"+gameContext.getState().stateName+"��");
		
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
