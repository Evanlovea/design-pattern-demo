package command_pattern;

public class Client {
	public static void main(String args[]) {
		FunctionButton fb1;
		fb1=new FunctionButton("�˳�");
		 Command command1;
    	 // //ͨ����ȡ�����ļ��ͷ������ɾ����������
    	 command1=(Command)command_pattern.XMLUtil.getBean();
    	 fb1.setCommand(command1);
    	 fb1.click();
	}
}
