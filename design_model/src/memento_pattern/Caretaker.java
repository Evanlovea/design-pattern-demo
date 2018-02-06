package memento_pattern;
//负责人
//保存备忘录
//只负责存储，不负责修改，无需知道对象的细节
public class Caretaker {
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
}
