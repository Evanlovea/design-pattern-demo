package observer_pattern;
//����۲���
public interface Observer {
	 public String getName();  
	    public void setName(String name);  
	    public void help(); //����֧Ԯ���ѷ���  
	    public void beAttacked(CenterControllerAbstract ca); //�������ܹ�������  
}
