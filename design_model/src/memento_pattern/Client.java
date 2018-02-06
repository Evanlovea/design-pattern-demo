package memento_pattern;

public class Client {
	public static void main(String args[]) {
		Originator originator=new Originator();//原发器
		Caretaker caretaker=new Caretaker();//创建负责人
		originator.setChessName("马");
		originator.setX(1);
		originator.setY(0);
		System.out.println("状态一：");
		originator.display();
		caretaker.setMemento(originator.saveMemento());
		System.out.println("--------------------------");
		originator.setChessName("马");
		originator.setX(5);
		originator.setY(6);
		originator.display();
		System.out.println("--------------------------");
		//恢复
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("悔棋回到状态一：");
		originator.display();
		System.out.println("--------------------------");
	}
}
