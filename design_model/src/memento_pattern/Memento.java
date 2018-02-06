package memento_pattern;
//备忘录
/*
 * 存储原发器的内部状态，根据原发器决定保存那些内部状态
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
