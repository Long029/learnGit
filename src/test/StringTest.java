package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.junit.Ignore;
import org.junit.Test;

public class StringTest {
    @Ignore
    @Test
    public void test(){
        String str = " glob| prok| pish| tegj|";
//        System.out.println(str.substring(0, 3));
        String strA = str.substring(str.indexOf("o"));
        System.out.println(strA);
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb);
    }

    /**
     * Set的值不能重复
     */
    @Ignore
    @Test
    public void test1(){
        Set<String> produce = new HashSet<>();
        produce.add("gold");
        produce.add("gold");
        System.out.println(produce.size());
    }
    /**
     * 测试subString
     */
    @Ignore
    @Test
    public void test2(){
        String str ="{key1=123&transeq=12368&cnx=2138&trx=0973}";
        String transeq = str.substring(str.indexOf("transeq"));
        transeq = transeq.substring(0, transeq.indexOf("&"));
        System.out.println(transeq);
    }
    /**
     * 测试正则
     */
    @Ignore
    @Test
    public void test3(){
        String str ="^ABCD[a-z]{2}\\d{5}$";
        Pattern pt = Pattern.compile(str);
        String test = "ABCCsz12345";
        System.out.println(pt.matcher(test).matches());
    }
    
    /**
     * String.valueOf()执行速度似乎快于强转 > + ""
     * 但是valueOf不能处理null 
     */
    @Ignore
    @Test
    public void test4(){
        String numStr = String.valueOf(null);
        System.out.println(numStr);
    }
    
    @Test
    public void test5() {
        String[] strList = { "q", "s", "w", "v", "g", "j" };
        List<String> strArray = Arrays.asList(strList);
        strArray = new ArrayList<>(strArray);
        List<String> strArrayb = new ArrayList<String>();
        strArrayb.add("q");
        String[] strListc = { "s", "v" };
        List<String> strArrayc = Arrays.asList(strListc);
//        System.out.println(strArray.toString());
         System.out.println(""+strArray.removeAll(strArrayc));

    }
}
