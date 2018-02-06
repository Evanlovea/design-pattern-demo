package singleton_pattern;

import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class SubFrame extends JInternalFrame {

	/**
	 * �Ӵ��ڣ�������
	 */
	private static final long serialVersionUID = 1L;
	private static SubFrame frame;
	private SubFrame() {
		
		super("�Ӵ���",true,true,true,false);
		this.setLocation(20,20);//�����ڲ�����λ��
		this.setSize(200,200);
		this.addInternalFrameListener(new MyIFListener());//���������¼�
		this.setVisible(true);
	}
	//�������������ش���ʵ��
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
