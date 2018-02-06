package facade_pattern;

//外观类
public class Mainframe {
   private CPU cpu;
   private HardDisk hardDisk;
   private Memory memory;
   private OS os;
   
 
	
	public Mainframe() {
		 cpu=new CPU();
		 hardDisk=new HardDisk();
		 memory=new Memory();
		 os=new OS();
	}


	public void on() {
		try {
			cpu.run();
			hardDisk.read();
			memory.check();
			os.load();
		}catch(Exception e) {
			System.out.println("启动失败");
		}
	}

	
}