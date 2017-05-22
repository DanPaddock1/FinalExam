package rocketBase;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException 
	{
		double dInterestRate = 0;
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		double temp = 0;
		for(int i = 0; i < rates.size(); i++){
			if(rates.get(i).getdInterestRate() > GivenCreditScore){
				temp = rates.get(i).getdInterestRate();
			}
		}  if (temp == 0){
			throw new RateException(rates.get(0));
		}
		
		//ArrayList<RateDomainModel> rdm = (ArrayList<RateDomainModel>) rates.stream().filter(u -> u.getdInterestRate() == GivenCreditScore);


		return dInterestRate;
	}
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}
