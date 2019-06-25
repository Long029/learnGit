package test;

import java.math.BigDecimal;

import org.junit.Ignore;
import org.junit.Test;

public class BDTest {
    @Ignore
	@Test
	public void test(){
		BigDecimal bg1 = new BigDecimal("57800");
		BigDecimal bg2 = new BigDecimal("6");
		BigDecimal rst = bg1.divide(bg2, 2, BigDecimal.ROUND_HALF_UP);
		System.out.println(rst.toString());
	}
	@Test
    public void test1(){
	    int num = 1 << 4; //2的 4次方  2* 2的2平方
	    int num2 = 4 >> 1;
	    System.out.println(num);
	}
}
