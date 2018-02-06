package abstract_factory;

public class MacFactory implements EFactory {
	
	
	

		@Override
		public Cpu produceCpu() {
			// TODO Auto-generated method stub
			return new MacCpu();
		}

		@Override
		public Ram produceRam() {
			// TODO Auto-generated method stub
			return new MacRam();
		}
	
}
