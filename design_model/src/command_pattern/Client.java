package command_pattern;

public class Client {
	public static void main(String args[]) {
		FunctionButton fb1;
		fb1=new FunctionButton("退出");
		 Command command1;
    	 // //通过读取配置文件和反射生成具体命令对象
    	 command1=(Command)command_pattern.XMLUtil.getBean();
    	 fb1.setCommand(command1);
    	 fb1.click();
	}
}
