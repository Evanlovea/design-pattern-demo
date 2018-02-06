package builder;

public class NoteBookComputerBuilder extends ComputerBuilder{
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("笔记本CPU");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("笔记本Ram");
	}

	@Override
	public void buildHardDisk() {
		// TODO Auto-generated method stub
		computer.setHardDisk("笔记本硬盘");
	}

	@Override
	public void buildMaster() {
		// TODO Auto-generated method stub
		computer.setMaster("笔记本主机");
	}

	@Override
	public void buildIndicator() {
		// TODO Auto-generated method stub
		computer.setIndicator("笔记本显示器");
	}
}
