�����Ʒ��TV
public interface TV
{
	public void play();
}

�����Ʒ�� HairTV(�������ӻ��ࣩ
public class HaierTV implements TV
{
	public void play()
	{
		System.out.println("�������ӻ�������......");
	}
}

���󹤳���TVFactory(���ӻ������ࣩ
public interface TVFactory
{
    public TV produceTV();
}
���幤����HairTVFactory(�������ӻ������ࣩ
public class HaierTVFactory implements TVFactory
{
    public TV produceTV()
    {
    	System.out.println("�������ӻ����������������ӻ���");
    	return new HaierTV();
    }
}

�ͻ��˲�����Client
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
