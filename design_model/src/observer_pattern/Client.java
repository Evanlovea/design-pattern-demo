package observer_pattern;

public class Client {

	public static void main(String[] args) {
		
	 /*
   	  * 观察者模式
   	  */
		//定义观察目标对象
		CenterController ca=new CenterController("猪跑了");
		//定义观察者对象
		Observer observer1=new Player("jack");
		Observer observer2=new Player("lilei");
		Observer observer3=new Player("tim");
		//加入战队
		ca.join(observer1);
		ca.join(observer2);
		ca.join(observer3);
		//队友被攻击，战队其他成员作出回应
	    observer1.beAttacked(ca);
	}

}
