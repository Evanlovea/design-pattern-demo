package singleton_pattern;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

public class MainClass extends JFrame {

	/**
	 * 客户端测试类
	 */
	private static final long serialVersionUID = 1L;
	private JButton button;
	private JDesktopPane desktopPane;
	private JButton button1;
	private JButton buttonx;
	private SubFrame iFrame;
    @SuppressWarnings("deprecation")
	public MainClass() {
    	super("主窗体");
    	Container c =this.getContentPane();
    	c.setLayout(new BorderLayout());
    	button=new JButton("单击创建一个内部窗体");
    	button1=new JButton("一个新的按钮");
    	//buttonx=new JButton("xxx");
    	button1.addActionListener(new Bt1Listener());
    	
    	button.addActionListener(new BtListener());
    	c.add(button,BorderLayout.SOUTH);
    	c.add(button1,BorderLayout.NORTH);
    	//c.add(buttonx,BorderLayout.CENTER);
    	//创建DesktopPane
    	desktopPane=new JDesktopPane();
    	c.add(desktopPane);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setLocationRelativeTo(null);
    	this.setSize(400,400);
    	this.show();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new MainClass();
        
	}
	
	public class BtListener implements ActionListener {

	

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(iFrame!=null) {
				desktopPane.remove(iFrame);
			}
			iFrame=SubFrame.getFrame();
			desktopPane.add(iFrame);

		}

}
	public class Bt1Listener implements ActionListener {


		@Override
		public void actionPerformed(ActionEvent e) {
			
		}

}
}
