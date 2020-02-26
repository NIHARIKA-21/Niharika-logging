package cleancode.interest;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestMain {
	private static final Logger LOGGER= LogManager.getLogger(InterestMain.class);
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int timePeriod;
		double principalAmount,rateOfInterest;
		int choice;
		LOGGER.info("1. SimpleInterest  2. CompundInterest\n");
		LOGGER.info("enter your choice\n");
		choice=sc.nextInt();
		if(choice!=1 && choice!=2)
		{
			LOGGER.info("Invalid Choice");
		}
		else 
		{
			LOGGER.info("Enter principle amount\n");
			principalAmount=sc.nextDouble();
			LOGGER.info("Enter rate of Interest\n");
			rateOfInterest=sc.nextDouble();
			LOGGER.info("Enter value of period in years\n");
			timePeriod=sc.nextInt();
			Interest interest=new Interest(principalAmount,rateOfInterest,timePeriod);
			if(choice==1)
				LOGGER.info("Simple Interest is "+interest.calculateSimpleInterest()+"\n");
			else
				LOGGER.info("Compound Interest is "+interest.calculateCompoundInterest()+"\n");
		}
	}
}
