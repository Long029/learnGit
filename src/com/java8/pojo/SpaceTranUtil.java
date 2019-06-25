package com.java8.pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class SpaceTranUtil {

	private static Map<Character, Integer> map = new HashMap<>();
	static{
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
	}
	
	public static boolean isValidate(String number){
		Pattern pattern = Pattern.compile("^M{0,3}(?:CM|CD|D?C{0,3})(?:XC|XL|L?X{0,3})(?:IX|IV|V?I{0,3})$");
		return pattern.matcher(number).matches();
	}
	
	public static int tranfer2Num(String numStr){
		List<Integer> list = new ArrayList<>();
		char[] chars = numStr.toCharArray();
		
		for (char cr : chars) {
            list.add(map.get(cr));
        }
		
        int rst = 0;
        int beforeNum;
        int rightNowNum;
        int nextNum;
        boolean isSubFirst = false; //判断第一次是否是相加
        if(list.size() == 1){
        	return map.get(list.get(0));
        }else if(list.size() == 2){
        	rightNowNum = list.get(0);
        	nextNum = list.get(1);
        	rst = rightNowNum < nextNum ? nextNum - rightNowNum : rightNowNum + nextNum;
        	return rst;
        }
        for (int i = 1; i < list.size(); i++) {
            beforeNum = list.get(i - 1);
            rightNowNum = list.get(i);
            if (i + 1 == list.size()) {
                rst += rightNowNum;
                break;
            }
            nextNum = list.get(i + 1);
            if (beforeNum > rightNowNum && rightNowNum < nextNum) {
                rst += nextNum - rightNowNum;
                System.out.println("if0 , rst is: " + rst);
                ++i;
            } else if (beforeNum >= rightNowNum && rightNowNum >= nextNum) {
                rst += rightNowNum;
                System.out.println("if1 , rst is: " + rst);
            } else {
                rst += rightNowNum - beforeNum;
                isSubFirst = true;
                System.out.println("else , rst is: " + rst);
            }
        }
        rst += isSubFirst ? 0 : list.get(0);
		return rst;
	}
	
	public static boolean test(String str){
	    List<Object> a = new ArrayList<>(Arrays.asList(str.toCharArray()));
        char temp = 0;
        
        if( a.get(0) instanceof String)
        {
            String aStringValue = (String) a.get(0);
            temp = aStringValue.charAt(0);
        }
        
        int count = 1;
        for (int i = 1; i < a.size(); i++)
        {
            if(a.get(i) instanceof String)
            {
                String aStringValue = (String) a.get(i);
                
                char aValue = aStringValue.charAt(0);
                
                if (aValue != temp)
                {
                    temp = aValue;
                    count = 1;
                }
                else if (aValue == temp)
                {
                    count++;
                }
                
                if (count == 2 && (aValue == 'D' || aValue == 'L' || aValue == 'V'))
                {
                    System.out.println("Consective Numbers of "+ a.get(i) + " are not allowed");
                    return true;
                }
                
                if (count == 4)
                {
                    System.out.println("Consective Numbers of "+ a.get(i) + " are not allowed");
                    return true;
                }
            }
        }
        return false;
	}
}
