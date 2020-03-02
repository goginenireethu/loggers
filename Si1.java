package com.vnrvjiet.ankitha.SimpleInterest.SI;
import com.vnrvjiet.ankitha.compoundInterest.CI;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Si
{
	private static final Logger LOGGER = LogManager.getLogger(Si.class);
	public static void main(String args[])
	{
		double p,r,t,sim;
		Scanner scan=new Scanner(System.in);
		try
		{
		LOGGER.info("Enter the amount");
		//read the input values from keyboard
				p=scan.nextInt();
				LOGGER.info("Enter the rate of interest ");
				//read the rate of interest
				r=scan.nextInt();
				LOGGER.info("Enter the no. of years");
				//read the no.years from keyboard
				t=scan.nextInt();
				//simple interest calculation
				sim=(p * t * r)/100;
				//printing the SI 
				LOGGER.info("simpleInterest ="+sim);
				//creating the object for class compound Interest
				CI obj=new CI();
				//calling the method which gives compound interest 
				obj.CompIntrst(p,r,t);
		}
		catch(Exception e)
		{
			LOGGER.error("only number are valid \n run the code again ");
		}

		
		//if any exception occurs 
		
		
		
	}

}
