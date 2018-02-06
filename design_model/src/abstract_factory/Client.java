package abstract_factory;

public class Client {
   public static void main(String args[]) {
	   try {
		   EFactory factory;
		   Cpu cpu;
		   Ram ram;
		   factory=(EFactory)XMLUtil.getBean();
        	cpu=factory.produceCpu();
        	cpu.display();
        	ram=factory.produceRam();
        	ram.display1();
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	 
	   
   }
}
