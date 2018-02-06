package memento_pattern;
//ԭ����ģʽ
/*
 * @author:Evan
 * @function�� ����һ������¼�����洢���ĵ�ǰ�ڲ�״̬
 */
public class Originator {
	private String  chessName;
	private int x;
	private int y;
	/*public Originator(String chessName,int x,int y) {
		this.chessName=chessName;
		this.x=x;
		this.y=y;
	}*/
	/*
	 * ����״̬
	 */
	public Memento saveMemento() {
		return new Memento(chessName,x,y);
	}
	/*
	 *�ָ�״̬
	 */
	public void restoreMemento(Memento memento) {
		this.chessName=memento.getChessName();
		this.x=memento.getX();
		this.y=memento.getY();
	}
	/*
	 * ��ʾ����
	 */
	public void display() {
		System.out.println("chessName:"+chessName);
		System.out.println("λ��Ϊ��"+"("+x+","+y+")");
	}
	/*
	 * @Getter
	 * @Setter
	 */
	public String getChessName() {
		return chessName;
	}
	public void setChessName(String chessName) {
		this.chessName = chessName;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
