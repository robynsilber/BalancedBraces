package junitTesting;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import TestTool.ReadFile;

public class ReadFileTest {

	@Test
	public void test() {
		ReadFile mReadFile = new ReadFile();
		
		//positive test
		String mInput1 = new String("test.txt");
		ArrayList<String> mOutput1 = mReadFile.readFile(mInput1);
		assertEquals(false, mOutput1.isEmpty());
		
		
		//negative test
		String mInput2 = new String("tester.txt");
		ArrayList<String> mOutput2 = mReadFile.readFile(mInput2);
		assertEquals(true, mOutput2.isEmpty());
		
	}

}
