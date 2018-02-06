抽象产品类TV
public interface TV
{
	public void play();
}

具体产品类 HairTV(海尔电视机类）
public class HaierTV implements TV
{
	public void play()
	{
		System.out.println("海尔电视机播放中......");
	}
}

抽象工厂类TVFactory(电视机工厂类）
public interface TVFactory
{
    public TV produceTV();
}
具体工厂类HairTVFactory(海尔电视机工厂类）
public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("海尔电视机工厂生产海尔电视机。");
    	return new HaierTV();
    }
}

客户端测试类Client
public class Client
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	TVFactory factory;
         	factory=(TVFactory)XMLUtil.getBean();
         	tv=factory.produceTV();
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
