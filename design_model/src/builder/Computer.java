package builder;
//��Ʒ��
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
   private String hardDisk;//Ӳ��
   private String master;//����
   private String indicator;//��ʾ��
   
}
