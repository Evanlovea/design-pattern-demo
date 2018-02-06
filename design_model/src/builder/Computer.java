package builder;
//产品类
public class Computer {
   public String getCpu() {
		return Cpu;
	}
	public void setCpu(String cpu) {
		Cpu = cpu;
	}
	public String getRam() {
		return Ram;
	}
	public void setRam(String ram) {
		Ram = ram;
	}
	public String getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(String hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getMaster() {
		return master;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	
private String Cpu;
   private String Ram;
   private String hardDisk;//硬盘
   private String master;//主机
   private String indicator;//显示器
   
}
