package test;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

import org.junit.Test;

public class MapTest {
    @Test
    public void test(){
        HashMap<String , String> map1 = new HashMap<>();
        map1.put("1", "a");
        map1.put("2", "b");
        map1.put("3", "c");
        HashMap<String , String> map2 = new HashMap<>();
        map2.put("a", "1");
        
        HashMap<String , String> map = new HashMap<>();
        map.putAll(map1);
        map.putAll(map2);
        
        Set<Entry<String, String>> keyValue = map.entrySet();
        for (Entry<String, String> entry : keyValue) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
