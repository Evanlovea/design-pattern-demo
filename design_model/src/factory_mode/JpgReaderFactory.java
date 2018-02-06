package factory_mode;

public  class JpgReaderFactory extends ImageReaderFactory{



	@Override
	public ImageReader createImageReader() {
		// TODO Auto-generated method stub
		System.out.println("jpg工厂制造jpg图片");
		return new JpgReader();
	}

}
