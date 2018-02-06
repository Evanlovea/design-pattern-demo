package command_pattern;

public class HelpCommand implements Command {
	private DisplayHelpClass display;
	public HelpCommand() {
		display=new DisplayHelpClass();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		display.dispaly();
	}

}
