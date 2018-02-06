package abstract_factory;

public class PcFactory implements EFactory{

	@Override
	public Cpu produceCpu() {
		// TODO Auto-generated method stub
		return new PcCpu();
	}

	@Override
	public Ram produceRam() {
		// TODO Auto-generated method stub
		return new PcRam();
	}

}
