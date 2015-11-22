package JUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import TestTool.FileChooser;

public class FileChooserTest {

	@Test
	public void getExtensionTest() {
		FileChooser mChooser = new FileChooser();
		
		//positive test
		String mInput1 = "hello/monkey/cheese/test.txt";
		String mOutput1 = mChooser.getExtension(mInput1);
		assertEquals("txt", mOutput1);
		
		//negative test
		String mInput2 = "hello/monkey/chees.txte/test";
		String mOutput2 = mChooser.getExtension(mInput2);
		assertEquals("", mOutput2);	
	}

}
