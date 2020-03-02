package com.vnrvjiet.ankitha.compoundInterest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.vnrvjiet.ankitha.SimpleInterest.SI.Si;

public class CI {
	//creating logger object fro a class CI
	private static final Logger LOGGER = LogManager.getLogger(CI.class);
	
		public void CompIntrst(double p, double r, double t)
		
		{
		double com;
		//calculating the compound interest
		com=p * Math.pow(1.0+r/100.0,t) - p;
		//printing the compound interest using logger
		LOGGER.info("compound interest is = "+com);
		}
	
}
