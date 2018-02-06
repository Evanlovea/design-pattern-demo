package command_pattern;

public class FunctionButton {
	private String name;//功能键名称
	private Command command;//命令
	public FunctionButton(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	//为功能键注入命令
	public void setCommand(Command command) {
		this.command=command;
	}
	public void click() {
		command.execute();
	}
}
