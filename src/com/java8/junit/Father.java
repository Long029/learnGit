package com.java8.junit;

public class Father extends GrandPa{
	static{
		System.out.println("Father is here");
	}
	public static int factor = 25;
	public Father(){
		System.out.println("Hello!");
	}
}
