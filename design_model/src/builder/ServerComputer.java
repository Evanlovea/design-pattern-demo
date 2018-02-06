package builder;

public class ServerComputer extends ComputerBuilder {
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("服务器CPU");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("服务器Ram");
	}

	@Override
	public void buildHardDisk() {
		// TODO Auto-generated method stub
		computer.setHardDisk("服务器硬盘");
	}

	@Override
	public void buildMaster() {
		// TODO Auto-generated method stub
		computer.setMaster("服务器主机");
	}

	@Override
	public void buildIndicator() {
		// TODO Auto-generated method stub
		
	}

	
}
