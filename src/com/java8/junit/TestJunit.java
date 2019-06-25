package com.java8.junit;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import junit.framework.TestCase;

public class TestJunit extends TestCase {
	protected double numbA ;
	protected double numbB ;
	
	@Before
	public void setUp(){
		numbA = 2.01;
		numbB = 3.5;
	}
	
//	@Test
//	public void testAdd(){
//		System.out.println("Number of test Case is : "+ this.countTestCases());
//		
//		System.out.println("Name of test Case is : "+ this.getName());
//		
//		this.setName("testAddddddd");
//		System.out.println("Name of test Case is : "+ this.getName());
//		assertEquals(3, numbA+numbB);
//	}
//	@Test
//	public void test(){
//		String aString  = "67h/sdv";
//		String bString ="";
//		String cString = aString.substring(0,aString.indexOf('/'));
//		String dString = aString.substring(aString.indexOf('/'),aString.length());
//		int ccc = aString.indexOf('/');
//		
//		System.out.println("ccc is : "+ ccc);
//		System.out.println("Name of test Case is : "+ this.getName());
//		assertEquals("/sdv", dString);
//	}
	
	@Test
	public void testABString() {
		String aString = null;
		String bString = null;

		String a1String = "aaa";
		String b1String = "aaa";
//		String testA = aString;
//		String testB = bString;
//		boolean rst = testA == null ? testB == null : testB != null;
		boolean rst = "null".equals(aString);
		assertEquals(false, rst);

//		testA = a1String;
//		testB = b1String;
//		rst = testA == null ? testB == null : testB != null;
//		assertEquals(true, rst);
//
//		testA = a1String;
//		testB = bString;
//		rst = StringUtils.isEmpty(testA) ? StringUtils.isEmpty(testB) : !StringUtils.isEmpty(testB);
//		assertEquals(false, rst);
//
//		testA = aString;
//		testB = b1String;
//		rst = testA == null ? testB == null : testB != null;
//		assertEquals(false, rst);

	}


}
