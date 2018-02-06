package factory_mode;

public class GifReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader createImageReader() {
		System.out.println("gif工厂制造jpg图片");
		return new GifReader();
	}

}
