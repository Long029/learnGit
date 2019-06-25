package com.java8.learn;

import java.util.HashMap;
import java.util.Map;

public class MathResult {
	
	public int subScore(int a, int b){
		return a + b;
	}
	
	public  String testMap(){
		Map<String, String> map = new HashMap<>();
		String strA = "abc";
		String strB = "ABC";
		map.put(strA, strA);
		map.put(strB, strB);
		strA = "123";
		strB = "456";
		System.out.println(map.keySet().toString());
		return "";
	}
}
