package junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import TestTool.BalanceBraces;

public class BalanceBracesTest {
	
	@Test
	public void testIfElseChecker(){
		BalanceBraces mBraces = new BalanceBraces();
		
		//positive checks
		char mInput1a = '{';
		char mInput1b = '}';
		boolean mOutput1 = mBraces.ifElseCheck(mInput1a, mInput1b);
		assertEquals(true, mOutput1);
		
		char mInput2a = '(';
		char mInput2b = ')';
		boolean mOutput2 = mBraces.ifElseCheck(mInput2a, mInput2b);
		assertEquals(true, mOutput2);
		
		char mInput3a = '[';
		char mInput3b = ']';
		boolean mOutput3 = mBraces.ifElseCheck(mInput3a, mInput3b);
		assertEquals(true, mOutput3);
		
		//negative check
		char mInput4a = '(';
		char mInput4b = ']';
		boolean mOutput4 = mBraces.ifElseCheck(mInput4a, mInput4b);
		assertEquals(false, mOutput4);
		
	}
	
	@Test
	public void testgetOpeningChar(){
		BalanceBraces mBraces = new BalanceBraces();
		
		//positive checks
		char mInput1 = '}';
		char mOutput1 = mBraces.getOpeningChar(mInput1);
		assertEquals('{', mOutput1);
		
		char mInput2 = ']';
		char mOutput2 = mBraces.getOpeningChar(mInput2);
		assertEquals('[', mOutput2);
		
		
		//negative checks
		char mInput3 = 'k';
		char mOutput3 = mBraces.getOpeningChar(mInput3);
		assertEquals('(', mOutput3);
		
	}

}
