package com.ivanchev;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void AddTest() {
		
		MyClass junit = new MyClass();
		int result = junit.Add(100,200);
		assertEquals(300,result);
		
		
	}

}
