package com.java8.learn;

import java.util.HashMap;
import java.util.Map;

public class FIndLucker {

	public static void main(String[] args) {
		int a = 0;
		int i = 0;
		int j = 100000;
		Map<Integer, Integer> newMap = new HashMap<Integer, Integer>();
		while(i < j){
			a =	(int)(Math.random()*10 );
			if(null == newMap.get(a)){
				newMap.put(a, 1);
			}else{
				newMap.put(a, newMap.get(a)+1);
			}
			i++;
		}
		System.out.println(j+" ��ѡ��1: "+ newMap.get(1)+" ��;");
		System.out.println(j+" ��ѡ��2: "+ newMap.get(2)+" ��;");
		System.out.println(j+" ��ѡ��3: "+ newMap.get(3)+" ��;");
		System.out.println(j+" ��ѡ��4: "+ newMap.get(4)+" ��;");
		System.out.println(j+" ��ѡ��5: "+ newMap.get(5)+" ��;");
		System.out.println(j+" ��ѡ��6: "+ newMap.get(6)+" ��;");
		System.out.println(j+" ��ѡ��7: "+ newMap.get(7)+" ��;");
		System.out.println(j+" ��ѡ��8: "+ newMap.get(8)+" ��;");
		System.out.println(j+" ��ѡ��9: "+ newMap.get(9)+" ��;");
		System.out.println(j+" ��ѡ��0: "+ newMap.get(0)+" ��;");
		System.out.println("�ܹ�: " + (newMap.get(0) + newMap.get(1) + newMap.get(2) + newMap.get(3) + newMap.get(4)
				+ newMap.get(5) + newMap.get(6)+newMap.get(7)+newMap.get(8)+newMap.get(9)));
//		Set<Integer> set = newMap.keySet();
//		for(Integer integer : set){
//			System.out.println(integer+"");
//		}
	}

}
