package builder;

public class DesktopComputer extends ComputerBuilder {

	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("̨ʽ��CPU");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("̨ʽ��Ram");
	}

	@Override
	public void buildHardDisk() {
		// TODO Auto-generated method stub
		computer.setHardDisk("̨ʽ��Ӳ��");
	}

	@Override
	public void buildMaster() {
		// TODO Auto-generated method stub
		computer.setMaster("̨ʽ������");
	}

	@Override
	public void buildIndicator() {
		// TODO Auto-generated method stub
		computer.setIndicator("̨ʽ����ʾ��");
	}

}
