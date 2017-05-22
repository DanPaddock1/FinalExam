package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	@Test
	public void rate_test1(){
		RateDAL.getAllRates();
	}
	
	@Test(expected = Exception.class)
	public void rate_test2() throws Exception{
		List lstRates = RateDAL.getAllRates();
		 if(lstRates.size() > 0){
			 throw new Exception();
		 } 
		 throw new Exception();
	}

}
