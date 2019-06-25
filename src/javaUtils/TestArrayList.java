package javaUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * List��Array�Ļ�ת
 * ���Կ��� asList�����Ƕ�Array��һ����ͼ, �����޷��޸�List�� ����
 * ����ʹ��26�еķ���new ��ArrayList
 * 
 *
 */
public class TestArrayList {
	@Ignore
    @Test
	public void test(){
		List<String> list2 = new ArrayList<>();
		list2.add("1");
		list2.add("2");
		list2.add("3");
//		List<String> list = new ArrayList<>(list2);
//		System.out.println(list.toString());
		String[] strArray = {"11","22","33"};
		List<String> list3 = new ArrayList<>(Arrays.asList(strArray));
		list3.add("weq");
		String[] array = list3.toArray(new String[4]);
		System.out.println(array[3]);
		Object[] array2 = Arrays.copyOf(strArray, list3.size());
		System.out.println(array2.toString());
	}
	
	@Test
	public void test1(){
	    String str = "{key1=value1&key2=value2&key3=value3}";
	    str = str.substring(1, str.length()-2);
	    String[] arr = str.split("&");
	    String[] arrKV;
	    for (String string : arr) {
	        arrKV = string.split("=");
	        System.out.println(arrKV[0]+"  "+ arrKV[1]);
        }
	}
	
	
	
}
