package memento_pattern;
//����¼
/*
 * �洢ԭ�������ڲ�״̬������ԭ��������������Щ�ڲ�״̬
 */
public class Memento {
	private String  chessName;
	private int x;
	private int y;
	public Memento(String chessName, int x, int y) {
		this.chessName=chessName;
		this.x=x;
		this.y=y;
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
