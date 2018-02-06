package builder;
//抽象建造者类
public abstract class ComputerBuilder {
   protected Computer computer=new Computer();
   public abstract void buildCpu();
   public abstract void buildRam();
   public abstract void buildHardDisk();
   public abstract void buildMaster();
   public abstract void buildIndicator();
   public Computer getComputer() {
	   return computer;
   }
  
}
