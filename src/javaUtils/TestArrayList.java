package javaUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

/**
 * List与Array的互转
 * 可以看出 asList方法是对Array的一个视图, 所以无法修改List的 长度
 * 可以使用26行的方法new 出ArrayList
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
