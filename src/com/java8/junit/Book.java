package com.java8.junit;

public class Book {

	public static void main(String[] args) {
		Founction();
	}
	static Book book = new Book();
	static{
		System.out.println("书的静态代码块");
	}
	{
		System.out.println("书的普通代码块");
	}
	Book(){
		System.out.println("书的构造方法");
		System.out.println("price is : "+ price + " page :"+page);
	}
	static int price = 100; 
	int page = 3000;
	public static void Founction(){
		System.out.println("静态方法");
	}
}
