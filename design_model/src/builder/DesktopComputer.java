package builder;

public class DesktopComputer extends ComputerBuilder {

	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("台式机CPU");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("台式机Ram");
	}

	@Override
	public void buildHardDisk() {
		// TODO Auto-generated method stub
		computer.setHardDisk("台式机硬盘");
	}

	@Override
	public void buildMaster() {
		// TODO Auto-generated method stub
		computer.setMaster("台式机主机");
	}

	@Override
	public void buildIndicator() {
		// TODO Auto-generated method stub
		computer.setIndicator("台式机显示器");
	}

}
