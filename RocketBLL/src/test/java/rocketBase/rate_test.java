package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	@Test
	public void testBLL(){
		assertTrue(Math.abs(RateBLL.getPayment(5, 1, 100, 3, true)) == 100.5);
	}
	
	@Test(expected = RateException.class)
	public void rate_test1() throws RateException{
		RateBLL.getRate(9000);
	}
	
	@Test
	public void rate_test3(){
			double x = 0;
			try {
				x = RateBLL.getRate(750);
			} catch (RateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			assertEquals(5.5, x, 100);
	}

}
