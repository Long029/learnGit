package javaUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Ignore;
import org.junit.Test;

/**
 * >> 1 是除以2的1次方
 * << 1 是乘2的1次方
 * @author gongylb
 *
 */
public class TestListSize {
	@Ignore
	@Test
	public void test(){
		int a = 10;
		System.out.println(a >> 1);
		System.out.println(a << 1);
		System.out.println(a << 2);
		System.out.println(a << 3);
	}
	
	/**
	 * 数组扩容
	 */
	@Ignore
	@Test
	public void test2(){
		int[] a = new int[10];
		a[0] = 1;
		System.out.println(a.length);
		int[] b = Arrays.copyOf(a, a.length+1);
		System.out.println(b.length);
	}
	
	/**
	 * remove方法只移除第一个出现的元素
	 */
	@Ignore
	@Test
	public void test3(){
		List<String> list = new ArrayList<>();
		list.add("111");
		list.add("222");
		list.add("222");
		list.remove("222");
		System.out.println(list);
	}
	
	/**
	 * retainAll是取并集  removeAll是移除第二个集合中的元素, 只要移除一个就返回true
	 */
	@Ignore
	@Test
	public void test4(){
		ArrayList<String> list = new ArrayList<>();
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("444");
		list.add("555");
		List<String> list2 = new ArrayList<>();
		list2.add("555");
		list2.add("2222");
		list.retainAll(list2);
		System.out.println(list);
		System.out.println(list.retainAll(list2));
	}
	@Ignore
	@Test
	public void test5(){
		List<String> list2 = new ArrayList<>(5);
		list2.add("555");
		list2.add("2222");
		list2.add("33");
		list2.add("34");
		list2.add("35");
		list2.add("36");
		System.out.println(list2.size());
	}
	
	@Ignore
    @Test
    public void test6() {
        List<String> list2 = new ArrayList<>();
        list2.add("555");
        list2.add("2222");
        list2.add("33");
        for (String str : list2) {
            if ("2222".equals(str)) {
                list2.remove(str);
            }
        }
        System.out.println(list2);
    }
	
	@Test
    public void test7(){
	    Map<String, String> map = new HashMap<>(5);
	    map.put("1", "1");
	    map.put("2", "1");
	    map.put("3", "1");
	    map.put("4", "1");
	    map.put("5", "1");
	    map.put("6", "1");
	    Set<Entry<String, String>> set = map.entrySet();
	    Set<String> setKey = map.keySet();
	    System.out.println(set);
	    System.out.println(setKey);
	}
}
