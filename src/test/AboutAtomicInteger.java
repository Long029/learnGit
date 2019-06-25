package test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

public class AboutAtomicInteger {
    /**
     * 原子类AtomicInteger可以地址引用  
     */
    @Test
 public void test(){
     Sysy s = new Sysy();
     
     Map<String, String> map = new HashMap<>();
     map.put("a", "111");
     s.setI(map);
     Integer a = new Integer(5);
     s.setAaaa(a);
     a = 6;
     map.put("b", "2222");
     
     AtomicInteger b = new AtomicInteger(5);
     s.setJ(b);
     b.set(b.intValue()+1);
     System.out.println(s.getJ().intValue());
     
     aNewTest(b);

     System.out.println(b.intValue());
     test2(map);
     System.out.println(map);
     System.out.println(s.getAaaa());
     
 }

    private void test2(Map<String, String> map) {
        map.put("aa", "aa");
    }

    private void aNewTest(AtomicInteger b) {
        b.set(b.intValue()+1);
    }
}
