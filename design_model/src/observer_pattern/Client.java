package observer_pattern;

public class Client {

	public static void main(String[] args) {
		
	 /*
   	  * �۲���ģʽ
   	  */
		//����۲�Ŀ�����
		CenterController ca=new CenterController("������");
		//����۲��߶���
		Observer observer1=new Player("jack");
		Observer observer2=new Player("lilei");
		Observer observer3=new Player("tim");
		//����ս��
		ca.join(observer1);
		ca.join(observer2);
		ca.join(observer3);
		//���ѱ�������ս��������Ա������Ӧ
	    observer1.beAttacked(ca);
	}

}
