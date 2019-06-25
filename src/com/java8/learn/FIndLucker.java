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
		System.out.println(j+" 次选中1: "+ newMap.get(1)+" 次;");
		System.out.println(j+" 次选中2: "+ newMap.get(2)+" 次;");
		System.out.println(j+" 次选中3: "+ newMap.get(3)+" 次;");
		System.out.println(j+" 次选中4: "+ newMap.get(4)+" 次;");
		System.out.println(j+" 次选中5: "+ newMap.get(5)+" 次;");
		System.out.println(j+" 次选中6: "+ newMap.get(6)+" 次;");
		System.out.println(j+" 次选中7: "+ newMap.get(7)+" 次;");
		System.out.println(j+" 次选中8: "+ newMap.get(8)+" 次;");
		System.out.println(j+" 次选中9: "+ newMap.get(9)+" 次;");
		System.out.println(j+" 次选中0: "+ newMap.get(0)+" 次;");
		System.out.println("总共: " + (newMap.get(0) + newMap.get(1) + newMap.get(2) + newMap.get(3) + newMap.get(4)
				+ newMap.get(5) + newMap.get(6)+newMap.get(7)+newMap.get(8)+newMap.get(9)));
//		Set<Integer> set = newMap.keySet();
//		for(Integer integer : set){
//			System.out.println(integer+"");
//		}
	}

}
