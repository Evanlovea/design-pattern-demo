package observer_pattern;
//����۲�����
public class Player implements Observer {
	private String name;  
	  
    public Player(String name) {  
        this.name = name;  
    }  
      
    public void setName(String name) {  
        this.name = name;  
    }  
      
    public String getName() {  
        return this.name;  
    }  
      
    //֧Ԯ���ѷ�����ʵ��  
    public void help() {  
        System.out.println("���ס��" + this.name + "�����㣡");  
    }  
      
    //���ܹ���������ʵ�֣������ܹ���ʱ������ս�ӿ����������֪ͨ����notifyObserver()��֪ͨ����  
    public void beAttacked(CenterControllerAbstract ca) {  
        System.out.println(this.name + "��������");  
        ca.notifyObserver(name);         
    }  

}
