package com.ivanchev;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void test() {
	 MyClass junit = new MyClass();
	 String result = junit.Conc("Plamen", "Ivanchev");
	 assertEquals("PlamenIvanchev",result);
	}

}
