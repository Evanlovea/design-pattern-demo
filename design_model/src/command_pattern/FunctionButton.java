package command_pattern;

public class FunctionButton {
	private String name;//���ܼ�����
	private Command command;//����
	public FunctionButton(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	//Ϊ���ܼ�ע������
	public void setCommand(Command command) {
		this.command=command;
	}
	public void click() {
		command.execute();
	}
}
