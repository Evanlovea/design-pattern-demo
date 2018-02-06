package mediator_pattern;
//����ͬ����
public abstract class Country {
	protected Union union;
	public void setUnion(Union union) {
		this.union=union;
	}
	
	public void sendMessage(String message) {
		union.sendMessage(message, this);
	}
	public abstract void getMessage(String message);
}
