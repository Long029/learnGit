package com.java8.junit;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestWork {
	@Test
	public void test(){
		List<String> list1 = null;
		for (int i = 0; i < 100; i++) {
			list1 = new ArrayList<String>();
			//do something
		}
		
		for (int i = 0; i < 100; i++) {
			List<String> list2 = new ArrayList<String>();
			//do something
			list2 = null;
		}
		
		
	}
}
