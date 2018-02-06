package singleton_pattern;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class SubFrame extends JInternalFrame {

	/**
	 * 子窗口：单例类
	 */
	private static final long serialVersionUID = 1L;
	private static SubFrame frame;
	private SubFrame() {
		
		super("子窗体",true,true,true,false);
		this.setLocation(20,20);//设置内部窗体位置
		this.setSize(200,200);
		this.addInternalFrameListener(new MyIFListener());//监听窗口事件
		this.setVisible(true);
	}
	//工厂方法，返回窗口实例
	public static SubFrame getFrame() {
		if(frame==null) {
			frame=new SubFrame();
			}
		return frame;
	}
	public class MyIFListener extends InternalFrameAdapter{
		public void internalFrameClosing(InternalFrameEvent e) {
			if(frame!=null) {
				frame=null;
			}
		
}
	}
}
