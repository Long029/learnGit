package com.java8.junit;

public class Book {

	public static void main(String[] args) {
		Founction();
	}
	static Book book = new Book();
	static{
		System.out.println("��ľ�̬�����");
	}
	{
		System.out.println("�����ͨ�����");
	}
	Book(){
		System.out.println("��Ĺ��췽��");
		System.out.println("price is : "+ price + " page :"+page);
	}
	static int price = 100; 
	int page = 3000;
	public static void Founction(){
		System.out.println("��̬����");
	}
}
