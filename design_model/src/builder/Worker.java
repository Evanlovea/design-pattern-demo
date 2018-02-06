package builder;
//指挥者类
public class Worker {
   private ComputerBuilder cb;
   public void setComputerBuilder(ComputerBuilder cb) {
	   this.cb=cb;
   }
   //构造函数
   public Computer construct() {
	   cb.buildRam();
	   cb.buildCpu();
	   cb.buildHardDisk();
	   cb.buildIndicator();
	   cb.buildMaster();
	   
	  
	return cb.getComputer();
	   
   }
}
