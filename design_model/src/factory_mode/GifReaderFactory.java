package factory_mode;

public class GifReaderFactory extends ImageReaderFactory{

	@Override
	public ImageReader createImageReader() {
		System.out.println("gif��������jpgͼƬ");
		return new GifReader();
	}

}
