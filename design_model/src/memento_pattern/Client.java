package memento_pattern;

public class Client {
	public static void main(String args[]) {
		Originator originator=new Originator();//ԭ����
		Caretaker caretaker=new Caretaker();//����������
		originator.setChessName("��");
		originator.setX(1);
		originator.setY(0);
		System.out.println("״̬һ��");
		originator.display();
		caretaker.setMemento(originator.saveMemento());
		System.out.println("--------------------------");
		originator.setChessName("��");
		originator.setX(5);
		originator.setY(6);
		originator.display();
		System.out.println("--------------------------");
		//�ָ�
		originator.restoreMemento(caretaker.getMemento());
		System.out.println("����ص�״̬һ��");
		originator.display();
		System.out.println("--------------------------");
	}
}
