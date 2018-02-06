package factory_mode;

import factory_mode.XMLUtil;

public class Client {
	public static void main(String args[]) {
		try {
			ImageReader imageReader;
			ImageReaderFactory imageReaderFactory;
			imageReaderFactory=(ImageReaderFactory)XMLUtil.getBean();
			imageReader=imageReaderFactory.createImageReader();
			imageReader.readImage();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
