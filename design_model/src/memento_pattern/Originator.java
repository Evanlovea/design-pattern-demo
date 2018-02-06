package memento_pattern;
//原发器模式
/*
 * @author:Evan
 * @function： 创建一个备忘录，并存储它的当前内部状态
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
	 * 保存状态
	 */
	public Memento saveMemento() {
		return new Memento(chessName,x,y);
	}
	/*
	 *恢复状态
	 */
	public void restoreMemento(Memento memento) {
		this.chessName=memento.getChessName();
		this.x=memento.getX();
		this.y=memento.getY();
	}
	/*
	 * 显示方法
	 */
	public void display() {
		System.out.println("chessName:"+chessName);
		System.out.println("位置为："+"("+x+","+y+")");
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
