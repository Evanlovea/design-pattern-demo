package command_pattern;

public class ExitCommand implements Command {
	private SystemExitClass sc;
	public ExitCommand() {
		sc=new SystemExitClass();
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		sc.exit();
	}

}
