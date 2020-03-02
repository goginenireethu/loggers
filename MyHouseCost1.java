package com.vnrvjiet.reethu.HouseConstruction_Cost.design;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyHouseCost 
{
	//creating obj for logger to MyHouseCost
	private static final Logger LOGGER = LogManager.getLogger(MyHouseCost.class);	
	public static void main(String args[])
	{
		
		Scanner scan=new Scanner(System.in);
		try {
			
		int opt;
		float sqrfeet;
		LOGGER.info("Enter the cost per square feet rate");
		//Scanning the cost per square feet rate 
		sqrfeet=scan.nextInt();
		int s;
		do
        {
			
			LOGGER.info(" enter 1 : 1200INR if we use standard materials");
			LOGGER.info(" enter 2 :1500INR if we use standard material");
			LOGGER.info(" enter 3 :1800INR if cutomers need high standard material");
			LOGGER.info(" enter 4 :2500INR if cutomers need high standard material and fully automated home");
		//Scans the user's input and function accordingly
		opt=scan.nextInt();
		
		switch(opt)
		{
		case 1:
			LOGGER.info("total cost for using  standard material :"+sqrfeet*1200);
			break;
		case 2:
			LOGGER.info("total cost for using above standard matrial :"+sqrfeet*1500);
			break;
		case 3:
			LOGGER.info("total cost if cutomers need high standard material :"+sqrfeet*1800);
	        break;	
		case 4:
			LOGGER.info("total cost if cutomers need high standard material and fully automated home :"+sqrfeet*2500);
		   break;
		case 5:
			LOGGER.info(0);
		}
		
		LOGGER.info("Continue(1/0)");
		//Scans the input whether to continue or not 
		 s=scan.nextInt();
        }while(s==1);
		
		if(s==0)
		{
			LOGGER.info("bye");
		}
		}
		//exceptions are handle
		catch(Exception e) {
			LOGGER.error("only numbers are vaild \n and the cose again ");
		}

}
}
