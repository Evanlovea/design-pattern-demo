package builder;

public class NoteBookComputerBuilder extends ComputerBuilder{
	@Override
	public void buildCpu() {
		// TODO Auto-generated method stub
		computer.setCpu("�ʼǱ�CPU");
	}

	@Override
	public void buildRam() {
		// TODO Auto-generated method stub
		computer.setRam("�ʼǱ�Ram");
	}

	@Override
	public void buildHardDisk() {
		// TODO Auto-generated method stub
		computer.setHardDisk("�ʼǱ�Ӳ��");
	}

	@Override
	public void buildMaster() {
		// TODO Auto-generated method stub
		computer.setMaster("�ʼǱ�����");
	}

	@Override
	public void buildIndicator() {
		// TODO Auto-generated method stub
		computer.setIndicator("�ʼǱ���ʾ��");
	}
}
