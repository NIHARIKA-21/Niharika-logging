package cleancode.interest;

public class Interest {
	double principal_amount,rate;
	int timeperiod;
	Interest(double principal_amt,double rate,int timeperiod)
	{
		principal_amount=principal_amt;
		this.rate=rate;
		this.timeperiod=timeperiod;
	}
	double calculateSimpleInterest()
	{
		return (principal_amount*timeperiod*rate)/100;
	}
	double calculateCompoundInterest()
	{
		double t=1+(rate/100);
		return principal_amount*Math.pow(t,timeperiod);
	}
}
