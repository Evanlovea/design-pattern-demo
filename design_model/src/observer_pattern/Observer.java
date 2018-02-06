package observer_pattern;
//抽象观察者
public interface Observer {
	 public String getName();  
	    public void setName(String name);  
	    public void help(); //声明支援盟友方法  
	    public void beAttacked(CenterControllerAbstract ca); //声明遭受攻击方法  
}
